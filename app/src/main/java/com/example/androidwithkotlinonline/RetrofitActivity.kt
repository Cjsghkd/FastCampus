package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
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
                    findViewById<RecyclerView>(R.id.studentsRecyclerView).apply {
                        this.adapter = StudentListRecyclerViewAdapter (
                            studentList!!,
                            LayoutInflater.from(this@RetrofitActivity)
                        )
                        this.layoutManager = LinearLayoutManager(this@RetrofitActivity)
                    }
                }
            }



            override fun onFailure(call: Call<ArrayList<StudentFromServer>>, t: Throwable) {
                // 서버가 문제가 생겨 응답을 못해줄 때 하고 싶은 작업 쓰는 부분
                TODO("Not yet implemented")
            }
        })

        findViewById<TextView>(R.id.createStudent).setOnClickListener {
            val student = HashMap<String, Any>()
            student.put("name", "코카콜라")
            student.put("intro", "펩시")
            student.put("age", 100)
            retrofitService.createStudent(student).enqueue(object : Callback<StudentFromServer>{

                override fun onResponse(
                    call: Call<StudentFromServer>,
                    response: Response<StudentFromServer>
                ) {
                    if(response.isSuccessful) {
                        val student = response.body()
                        Log.d("testt", "등록한 학생 : " + student!!.name)
                    }
                }

                override fun onFailure(call: Call<StudentFromServer>, t: Throwable) {
                    Log.d("testt","요청 실패")
                }
            })
        }
        findViewById<TextView>(R.id.easeCreateStudent).setOnClickListener {
            val student = StudentFromServer(name = "서울", age = 200, intro = "wellcom to seoul")
            retrofitService.easeCreateStudent(student).enqueue(object : Callback<StudentFromServer>{
                override fun onResponse(
                    call: Call<StudentFromServer>,
                    response: Response<StudentFromServer>
                ) {
                    if(response.isSuccessful) {
                        val student = response.body()
                        Log.d("testt", "등록한 학생 : " + student!!.name)
                    }
                }

                override fun onFailure(call: Call<StudentFromServer>, t: Throwable) {
                    Log.d("testt","요청 실패")
                }
            })
        }

    }
}

class StudentListRecyclerViewAdapter (
    var studentList : ArrayList<StudentFromServer>,
    var inflater : LayoutInflater
) : RecyclerView.Adapter<StudentListRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val studentName : TextView
        val studentAge : TextView
        val studentIntro : TextView

        init {
            studentName = itemView.findViewById(R.id.student_name)
            studentAge = itemView.findViewById(R.id.student_age)
            studentIntro = itemView.findViewById(R.id.student_intro)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.student_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.studentName.text = studentList.get(position).name
        holder.studentAge.text = studentList.get(position).age.toString()
        holder.studentIntro.text = studentList.get(position).intro
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}