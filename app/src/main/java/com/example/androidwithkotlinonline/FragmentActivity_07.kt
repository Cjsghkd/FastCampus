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
        // A,B,C,D
        (findViewById<TextView>(R.id.add)).setOnClickListener {
            val transaction = fragmentManager.beginTransaction() // 시작
            transaction.replace(R.id.root, fragmentFirst)
            transaction.commit() // 끝
        }

        (findViewById<TextView>(R.id.remove)).setOnClickListener {

        }


    }

    // Commit
    // 1> commit
    // 2> commitAllowingStateLoss
    // 3> commitNow
    // 4> commitNowAllowingStateLoss
}