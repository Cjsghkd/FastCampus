package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Test_01_check : AppCompatActivity() {

    lateinit var one : TextView
    lateinit var two : TextView
    lateinit var three : TextView
    lateinit var four : TextView
    lateinit var five : TextView
    lateinit var six : TextView
    lateinit var seven : TextView
    lateinit var eight : TextView
    lateinit var nine : TextView
    lateinit var zero : TextView
    lateinit var ca : TextView
    lateinit var plus : TextView
    lateinit var equal : TextView
    lateinit var result : TextView


    var input : String = ""
    var temp : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test01_check)

        findViews()

        one.setOnClickListener {
            input += (it as TextView).text
            result.text = input
        }

        two.setOnClickListener {
            input += (it as TextView).text
            result.text = input
        }

        three.setOnClickListener {
            input += (it as TextView).text
            result.text = input
        }

    }

    fun findViews() {
        one  = findViewById(R.id.One)
        two  = findViewById(R.id.Two)
        three = findViewById(R.id.Three)
        four = findViewById(R.id.Four)
        five = findViewById(R.id.Five)
        six = findViewById(R.id.Six)
        seven = findViewById(R.id.Seven)
        eight = findViewById(R.id.Eight)
        nine = findViewById(R.id.Nine)
        zero = findViewById(R.id.Zero)
        ca = findViewById(R.id.CA)
        plus = findViewById(R.id.Plus)
        equal = findViewById(R.id.Equal)
        result = findViewById(R.id.result)
    }

}