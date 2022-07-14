package com.example.androidwithkotlinonline

import retrofit2.Call
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

class User(
    val username : String,
    val token : String,
    val id : Int
)

class InstaPost (
    val content : String,
    val image : String,
    val owener_profile : Owener_profile
)

class Owener_profile (
    val username : String,
    val image : String
)

interface RetrofitService {

    @GET("instagram/post/list/all/")
    fun getInstagramPosts(

    ) : Call<ArrayList<InstaPost>>

    @POST("user/signup/")
    @FormUrlEncoded
    fun instaJoin(
        @FieldMap params : HashMap<String, Any>
    ) : Call<User>

    @POST("user/login/")
    @FormUrlEncoded
    fun instaLogin(
        @FieldMap params : HashMap<String, Any>
    ) : Call<User>

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