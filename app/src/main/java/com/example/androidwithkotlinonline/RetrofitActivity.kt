package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        // 서버 -> 읽을 수 없는 데이터 -> JSON -> GSON
        // GSON -> 읽을 수 없는 데이터를 코틀린 객체로 바꿔준다
        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create()) // 사람이 알아들을수 없는 것을 바꿀 것을 정하는 코드
            .build()
        val retrofitService = retrofit.create(RetrofitService::class.java)
        retrofitService.getStudentList().enqueue(object : Callback<ArrayList<StudentFromServer>>{ // 응답 받는 코드
            override fun onResponse(
                call: Call<ArrayList<StudentFromServer>>,
                response: Response<ArrayList<StudentFromServer>>
            ) { // 서버로부터 요청이 왔을 때 하고 싶은 작업 쓰는 부분
                if (response.isSuccessful) {
                    val studentList = response.body()
                    studentList!!.forEach {
                        Log.d("testt", "" + it.name)
                    }
                }
            }

            override fun onFailure(call: Call<ArrayList<StudentFromServer>>, t: Throwable) {
                // 서버가 문제가 생겨 응답을 못해줄 때 하고 싶은 작업 쓰는 부분
                TODO("Not yet implemented")
            }
        })
    }
}