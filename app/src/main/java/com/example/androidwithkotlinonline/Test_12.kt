package com.example.androidwithkotlinonline

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Test_12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test12)

        var testItem = mutableListOf<Test>()
        for (i in 0..10) {
            testItem.add(Test("" + i + "번째 사람", "010-1111-111" + i))
        }

        val inflater = LayoutInflater.from(this)
        val container = findViewById<LinearLayout>(R.id.container)
        testItem.forEach {
            val testItemView = inflater.inflate(R.layout.test_item, null)
            val testImage = testItemView.findViewById<ImageView>(R.id.testImage)
            val nthpeople = testItemView.findViewById<TextView>(R.id.peopleNumber)
            val nthphone = testItemView.findViewById<TextView>(R.id.phoneNumber)

            testImage.setImageDrawable(resources.getDrawable(R.drawable.blue_backgroud, this.theme))
            nthpeople.text = it.peopleNumber
            nthphone.text = it.phoneNumber
            container.addView(testItemView)

            testItemView.setOnClickListener {
                val intent = Intent(this, Test_12_check::class.java).apply {
                    this.putExtra("name", nthpeople.text)
                    this.putExtra("number", nthphone.text)
                }
                startActivity(intent)
            }
        }

    }
}

class Test (val peopleNumber : String, val phoneNumber : String) {

}