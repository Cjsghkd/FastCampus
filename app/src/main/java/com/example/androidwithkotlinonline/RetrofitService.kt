package com.example.androidwithkotlinonline

import okhttp3.Headers
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*
import java.io.File
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
    val id : Int,
    val content : String,
    val image : String,
    val owner_profile : Owner_profile
)

class Owner_profile (
    val username : String,
    val image : String?
)

class UserInfo(
    val id : Int,
    val username : String,
    val profile : Owner_profile
)

interface RetrofitService {

    @Multipart
    @PUT("user/profile/{user_id}/")
    fun changeProfile(
        @Path("user_id") userId : Int,
        @HeaderMap headers : Map<String, String>,
        @Part image : MultipartBody.Part,
        @Part("user") user : RequestBody
    ) : Call<Any>

    @GET("user/userInfo/")
    fun getUserInfo(
        @HeaderMap headers : Map<String, String>
    ) : Call<UserInfo>

    @Multipart  // 크기가 크면 이 명령어를 써줘야함 (조각내서 전송)
    @POST("instagram/post/")
    fun uploadPost(
        @HeaderMap headers : Map<String, String>,
        @Part image : MultipartBody.Part,
        @Part("content") content : RequestBody
    ) : Call<Any>

    @POST("instagram/post/like/{post_id}")
    fun postLike(
        @Path("post_id") post_id : Int
    ) : Call<Any>

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