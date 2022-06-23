package com.example.androidwithkotlinonline

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

// NetworkOnMainThreadException -> 네트워크 작업(통신)은 메인쓰레드에서 불가능

class NetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)

        NetworkAsyncTask().execute()
    }
}

class NetworkAsyncTask() : AsyncTask<Any?, Any?, Any?>() {
    override fun doInBackground(vararg p0: Any?): Any? {
        val urlString : String = "http://mellowcode.org/json/students/" // 요청할 주소
        val url : URL = URL(urlString)
        val connection : HttpURLConnection = url.openConnection() as HttpURLConnection

        connection.requestMethod = "GET"
        connection.setRequestProperty("Content-Type", "application/json")  // Header를 키-벨류 타입으로

        var buffer = ""
        if (connection.responseCode == HttpURLConnection.HTTP_OK) {
            val reader = BufferedReader(
                InputStreamReader(
                    connection.inputStream,
                    "UTF-8"
                )
            )
            buffer = reader.readLine()
            Log.d("testt", buffer)
        }
        return null
    }
}