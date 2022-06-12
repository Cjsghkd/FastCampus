package com.example.androidwithkotlinonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity_05_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_0501)

        (findViewById<TextView>(R.id.one)).setOnClickListener {
            startActivity(Intent(this@Activity_05_01, Activity_05_01::class.java))
        }

        (findViewById<TextView>(R.id.two)).setOnClickListener {
            val intent = Intent(this@Activity_05_01, Activity_05_02::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
        }

        (findViewById<TextView>(R.id.three)).setOnClickListener {
            startActivity(Intent(this@Activity_05_01, Activity_05_03::class.java))
        }

    }
}