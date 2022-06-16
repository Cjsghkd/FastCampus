package com.example.androidwithkotlinonline

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class AsyncActivity_09 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async09)

    }
}

class BackgroundAsyncTask(
    val progressBar : ProgressBar,
    val progressText: TextView
) : AsyncTask<Int, Int, Int>() {
    // Params, Progress, Result
    // params -> doInbackground 에서 사용할 타입

    // deprecated -> 더 이상 사용을 권장하지 않는다
    // RxJava, 코루틴(사용권장) 사용가능
    // 코루틴 -> 멀티 태스킹, 동기/비동기 처리

    override fun doInBackground(vararg p0: Int?): Int {
        TODO("Not yet implemented")
    }

    override fun onPreExecute() { // 실행전
        super.onPreExecute()
    }

    override fun onPostExecute(result: Int?) { // 실행후
        super.onPostExecute(result)
    }

    override fun onProgressUpdate(vararg values: Int?) { // 진행중
        super.onProgressUpdate(*values)
    }

    override fun onCancelled() { // 중지되었을때
        super.onCancelled()
    }
}