package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Test_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test01)

        var prev : String = ""
        var totalNumber : Int = 0
        var number : TextView = findViewById(R.id.number)
        val One : TextView = findViewById(R.id.One)
        val Two : TextView = findViewById(R.id.Two)
        val Three : TextView = findViewById(R.id.Three)
        val Four : TextView = findViewById(R.id.Four)
        val Five : TextView = findViewById(R.id.Five)
        val Six : TextView = findViewById(R.id.Six)
        val Seven : TextView = findViewById(R.id.Seven)
        val Eight : TextView = findViewById(R.id.Eight)
        val Nine : TextView = findViewById(R.id.Nine)
        val Zero : TextView = findViewById(R.id.Zero)
        val Plus : TextView = findViewById(R.id.Plus)
        val Values : TextView = findViewById(R.id.Values)
        val CA : TextView = findViewById(R.id.CA)

        One.setOnClickListener {
            prev = prev.plus("1")
            number.text = prev
        }
        Two.setOnClickListener {
            prev = prev.plus("2")
            number.text = prev
        }
        Three.setOnClickListener {
            prev = prev.plus("3")
            number.text = prev
        }
        Four.setOnClickListener {
            prev = prev.plus("4")
            number.text = prev
        }
        Five.setOnClickListener {
            prev = prev.plus("5")
            number.text = prev
        }
        Six.setOnClickListener {
            prev = prev.plus("6")
            number.text = prev
        }
        Seven.setOnClickListener {
            prev = prev.plus("7")
            number.text = prev
        }
        Eight.setOnClickListener {
            prev = prev.plus("8")
            number.text = prev
        }
        Nine.setOnClickListener {
            prev = prev.plus("9")
            number.text = prev
        }
        Zero.setOnClickListener {
            prev = prev.plus("0")
            number.text = prev
        }
        Plus.setOnClickListener {
            number.text = ""
            if (prev.isNotEmpty())
                totalNumber += prev.toInt()
            prev = ""
        }
        Values.setOnClickListener {
            totalNumber += prev.toInt()
            number.text = totalNumber.toString()
            prev = ""
        }
        CA.setOnClickListener {
            number.text = ""
            prev = ""
            totalNumber = 0
        }

    }
}