package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FragmentActivity_07 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment07)

        val fragmentManager = supportFragmentManager
        val fragmentFirst = Fragment_01()

        // Transaction
        // - 작업의 단위 -> 시작과 끝이 있다

        // Commit
        // 1> commit
        // 2> commitAllowingStateLoss
        // 3> commitNow
        // 4> commitNowAllowingStateLoss

        // commit - commitAllowingStateLoss
        //  - 상태손실을 허락한다
        //  - onStop, lifecycle 또는 os에 의해서 앱이 상태를 저장해야 할 수 있다
        //  - 상태저장 : onSaveInstanceState
        //  - commit : 저장을 한 경우 실행 할 수 없다 (IllegalStateException)
        //  - commitAllowingStateLoss : 저장을 한 경우 예외를 발생하지 않고 그냥 손실
        // commit - commitNow
        //  - commit -> 작업을 예약한다 (메인 쓰레드에 예약이 된다) (보통의 경우 commit 사용)
        //  - commitNow -> 바로 실행한다

        (findViewById<TextView>(R.id.add)).setOnClickListener {
            val transaction = fragmentManager.beginTransaction() // 시작
            transaction.replace(R.id.root, fragmentFirst)
            transaction.commit() // 끝
        }

        (findViewById<TextView>(R.id.remove)).setOnClickListener {
            val transaction = fragmentManager.beginTransaction()
            transaction.remove(fragmentFirst)
            transaction.commit()
        }


    }

}