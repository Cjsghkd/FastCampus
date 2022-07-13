package com.example.androidwithkotlinonline

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.*
import java.io.Serializable

class StudentFromServer(
    val id : Int,
    val name : String,
    val age : Int,
    val intro : String
) {
    constructor(name : String, age : Int, intro: String) : this(0, name, age, intro)
}

class YoutubeItem (
    val id : Int, val title : String, val content : String, val video : String, val thumbnail : String
)

class MelonItem (
    val id : Int, val title : String, val song : String, val thumbnail : String
) : Serializable

class UserToken(
    val username : String,
    val token : String
)

interface RetrofitService {

    @POST("user/signup/")
    @FormUrlEncoded
    fun instaJoin(
        @FieldMap params : HashMap<String, Any>
    ) : Call<UserToken>

    @POST("user/login/")
    @FormUrlEncoded
    fun instaLogin(
        @FieldMap params : HashMap<String, Any>
    ) : Call<UserToken>

    @GET("melon/list/")
    fun getMelonItemList() : Call<ArrayList<MelonItem>>

    @GET("json/students")
    fun getStudentList() : Call<ArrayList<StudentFromServer>>

    @POST("json/students/")
    fun createStudent(
        @Body params : HashMap<String, Any>
    ) : Call<StudentFromServer>

    @POST("json/students/")
    fun easeCreateStudent (
        @Body student : StudentFromServer
    ) : Call<StudentFromServer>

    @GET ("youtube/list/")
    fun getYoutubeItemList() : Call<ArrayList<YoutubeItem>>
}