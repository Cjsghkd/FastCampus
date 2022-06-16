package com.example.androidwithkotlinonline

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class AsyncActivity_09 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async09)

        val backgroundTask = BackgroundAsyncTask(
            findViewById(R.id.progressBar),
            findViewById(R.id.progessBarText)
        ).execute()

        (findViewById<TextView>(R.id.start)).setOnClickListener {
            backgroundTask.execute()
        }

        findViewById<TextView>(R.id.stop).setOnClickListener {
            backgroundTask.cancel(true)
        }

        findViewById<TextView>(R.id.shot).setOnClickListener {
            Log.d("testt", "SHOT!!")
        }
    }
}

class BackgroundAsyncTask(
    val progressBar : ProgressBar,
    val progressText: TextView
) : AsyncTask<Int, Int, Int>() {
    // Params, Progress, Result
    // params -> doInBackground 에서 사용할 타입
    // progress -> onProgressUpdate 에서 사용할 타입
    // result -> onPostExecute 에서 사용할 타입

    // deprecated -> 더 이상 사용을 권장하지 않는다
    // RxJava, 코루틴(사용권장) 사용가능
    // 코루틴 -> 멀티 태스킹, 동기/비동기 처리

    var percent : Int = 0

    override fun doInBackground(vararg p0: Int?): Int {
        while (isCancelled() == false) {
            percent++
            if (percent > 100) break
            else {
                Log.d("testt", "" + percent)
                publishProgress(percent)
            }
            Thread.sleep(100)
        }
        return percent
    }

    override fun onPreExecute() { // 실행전
        percent = 0
        progressBar.setProgress(percent)
    }

    override fun onPostExecute(result: Int?) { // 실행후
        progressText.text = "작업이 완료되었습니다"
    }

    override fun onProgressUpdate(vararg values: Int?) { // 진행중
        progressBar.setProgress(values[0] ?: 0)
        progressText.text = "퍼센트 : " + values[0]
    }

    override fun onCancelled() { // 중지되었을때
        progressBar.setProgress(0)
        progressText.text = "작업이 취소되었습니다"
    }
}