package com.example.androidwithkotlinonline

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.KeyEventDispatcher

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

        // 명시적 인텐트 + ComponentName -> 액티비티 전환
        val intent_one : TextView = findViewById(R.id.intent_one)
        intent_one.setOnClickListener {
            val intent : Intent = Intent()
            val componentName : ComponentName = ComponentName(
                "com.example.androidwithkotlinonline",
                "com.example.androidwithkotlinonline.Intent_03_02"
            )
            intent.component = componentName
            startActivity(intent)
        }

        // 명시적 인텐트 -> 액티비티 전환
        // Context
        // - 문맥
        // A액티비티 -> B액티비티
        (findViewById<TextView>(R.id.intent_two)).apply {
            this.setOnClickListener {
                startActivity(
                    Intent(this@Intent_03_01, Intent_03_02::class.java)
                )
            }
        }

        // 명시적 인텐트 + data 전달
        (findViewById<TextView>(R.id.intent_three)).apply {
            this.setOnClickListener {
                val intent = Intent(this@Intent_03_01, Intent_03_02::class.java)
                intent.putExtra("extra-data", "data-one")
                startActivity(intent)
            }
        }

    }
}