package com.example.androidwithkotlinonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity_05_03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_0503)

        (findViewById<TextView>(R.id.one)).setOnClickListener {
            startActivity(Intent(this@Activity_05_03, Activity_05_01::class.java))
        }

        (findViewById<TextView>(R.id.two)).setOnClickListener {
            startActivity(Intent(this@Activity_05_03, Activity_05_02::class.java))
        }

        (findViewById<TextView>(R.id.three)).setOnClickListener {
            startActivity(Intent(this@Activity_05_03, Activity_05_03::class.java))
        }
    }
}