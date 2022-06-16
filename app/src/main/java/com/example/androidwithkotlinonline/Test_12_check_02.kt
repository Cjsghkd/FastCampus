package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Test_12_check_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test12_check02)

        val name : String = intent.extras?.getString("name") ?: ""
        val number : String = intent.extras?.getString("name") ?: ""

        findViewById<TextView>(R.id.Name).text = name
        findViewById<TextView>(R.id.Number).text = number
    }
}