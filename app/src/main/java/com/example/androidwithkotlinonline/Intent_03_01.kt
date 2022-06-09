package com.example.androidwithkotlinonline

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Intent_03_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent0301)

        // 암시적 인텐트
        // - 전화, SNS, Google Play Store, Website, GoogleMap, 사진첩 등등
        // - 전화 : ACTION_DIAL, 사진첩 : ACTION_PICK
        // - 상수
        //      - 변하지 않는 수 (문자)
        //      - 상수의 변수명은 전부 대문자로 만드는 문화가 있다
        // - URI (Uniform Resource Indentifier)
        //      - id 라고 생각을 하면 된다 -> 고유하다
        //      - 자원을 나타내는 고유한 주소
        //      - URL
        //          - 인터넷 페이지의 고유한 주소
        val implicit_intent : TextView = findViewById(R.id.implicit_intent)
        implicit_intent.setOnClickListener {
            val intent : Intent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:010-1111-1111")
            )
            startActivity(intent)
        }
    }
}