package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class InstaJoin : AppCompatActivity() {
    var username : String = ""
    var password : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insta_join)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofitService = retrofit.create(RetrofitService::class.java)

        findViewById<EditText>(R.id.id_input).doAfterTextChanged {
            username = it.toString()
        }
        findViewById<EditText>(R.id.pw_input).doAfterTextChanged {
            password = it.toString()
        }

        findViewById<TextView>(R.id.login_btn).setOnClickListener {
            val user = HashMap<String, Any>()
            user.put("username", username)
            user.put("password", password)
            retrofitService.instaLogin(user).enqueue(object : Callback<Token>{
                override fun onResponse(call: Call<Token>, response: Response<Token>) {
                    if (response.isSuccessful) {
                        val token : Token = response.body()!!
                    }
                }

                override fun onFailure(call: Call<Token>, t: Throwable) {
                    Log.d("logintest", "fail")
                }
            })
        }
    }
}