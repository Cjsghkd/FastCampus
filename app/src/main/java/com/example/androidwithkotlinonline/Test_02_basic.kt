package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Test_02_basic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test02_basic)

        val button : Button = findViewById(R.id.searchButton)
        val webview : WebView = findViewById(R.id.webView)

        button.setOnClickListener {
            webview.settings.javaScriptEnabled = true
            val url : EditText = findViewById(R.id.url)
            val urlTextString = url.text.toString()
            webview.loadUrl(urlTextString)
        }
    }
}