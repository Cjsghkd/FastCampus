package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Test_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test01)



        var totalNumber : Int = 0
        var number : TextView = findViewById(R.id.number)
        val One : Button = findViewById(R.id.One)
        val Two : Button = findViewById(R.id.Two)
        val Three : Button = findViewById(R.id.Three)
        val Four : Button = findViewById(R.id.Four)
        val Five : Button = findViewById(R.id.Five)
        val Six : Button = findViewById(R.id.Six)
        val Seven : Button = findViewById(R.id.Seven)
        val Eight : Button = findViewById(R.id.Eight)
        val Nine : Button = findViewById(R.id.Nine)
        val Zero : Button = findViewById(R.id.Zero)

        One.setOnClickListener {
            number.text = "1"
        }
        Two.setOnClickListener {
            number.text = "2"
        }
        Three.setOnClickListener {
            number.text = "3"
        }
        Four.setOnClickListener {
            number.text = "4"
        }
        Five.setOnClickListener {
            number.text = "5"
        }
        Six.setOnClickListener {
            number.text = "6"
        }
        Seven.setOnClickListener {
            number.text = "7"
        }
        Eight.setOnClickListener {
            number.text = "8"
        }
        Nine.setOnClickListener {
            number.text = "9"
        }
        Zero.setOnClickListener {
            number.text = "0"
        }

    }
}