package com.example.androidwithkotlinonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class InstaJoinActivity : AppCompatActivity() {

    var username : String = ""
    var password1 : String = ""
    var password2 : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insta_join)

        findViewById<TextView>(R.id.insta_login).setOnClickListener {
            startActivity(Intent(this, InstaLoginActivity::class.java))
        }

        findViewById<EditText>(R.id.id_input).doAfterTextChanged { username = it.toString() }
        findViewById<EditText>(R.id.pw_input1).doAfterTextChanged { password1 = it.toString() }
        findViewById<EditText>(R.id.pw_input2).doAfterTextChanged { password2 = it.toString() }

        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofitService = retrofit.create(RetrofitService::class.java)

        findViewById<TextView>(R.id.join_btn).setOnClickListener {
            val user = HashMap<String, Any>()
            user.put("username", username)
            user.put("password1", password1)
            user.put("password2", password2)

            retrofitService.instaJoin(user).enqueue(object : Callback<UserToken>{
                override fun onResponse(call: Call<UserToken>, response: Response<UserToken>) {
                    if (response.isSuccessful) {
                        val userToken = response.body()!!
                    }
                }

                override fun onFailure(call: Call<UserToken>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })
        }




    }
}