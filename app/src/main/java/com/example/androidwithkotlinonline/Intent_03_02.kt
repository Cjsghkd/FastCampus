package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Intent_03_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent0302)

        // Intent_03_02 액티비티를 호출한 Activity의 intent이다
        val intent = intent
        val data : String? = intent.extras?.getString("extra-data")
        // val data1 : Int? = intent.extras?.getInt("extra-data")
        if (data != null) {
            Log.d("dataa", data)
        }
    }
}