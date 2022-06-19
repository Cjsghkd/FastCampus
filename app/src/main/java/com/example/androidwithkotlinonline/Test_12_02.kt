package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Test_12_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1202)

        val name = intent.extras?.getString("name")
        val number = intent.extras?.getString("number")

        var nameText = findViewById<TextView>(R.id.name0)
        var numberText = findViewById<TextView>(R.id.number0)

        nameText.text = name
        numberText.text = number
    }
}