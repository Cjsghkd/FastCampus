package com.example.androidwithkotlinonline

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText

class Test_02_hard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test02_hard)

        val url  = findViewById<EditText>(R.id.url)
        val button = findViewById<Button>(R.id.searchButton)
        val webView = findViewById<WebView>(R.id.webView)

        val urlFirst = "http://"
        var urlSecond = ""

        button.setOnClickListener {
            webView.settings.javaScriptEnabled = true
            urlSecond = url.text.toString()
            var urlFinal = urlFirst + urlSecond
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlFinal))
            startActivity(intent)
        }
    }
}