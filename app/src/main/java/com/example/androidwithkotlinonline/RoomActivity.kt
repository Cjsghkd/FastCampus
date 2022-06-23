package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
    }
}

@Entity
class UserProfile(
    @PrimaryKey val id : Int,

    @ColumnInfo(name = "last_name")
    val lastName : String,

    @ColumnInfo(name = "first_name")
    val firstName : String
)

@Dao
interface UserProfileDao {
    // CRUD -> 데이터베이스 조작
    // Query -> 데이터베이스 조회
    @Insert(onConflict = REPLACE) // REPLACE -> 교체한다, IGNORE -> 무시한다
    fun insert(userProfile: UserProfile)

    // SELECT * FROM youtube_youtube WHERE id = 1; (youtube_youtube 테이블에서 id가 1인 모든 컬럼을 선택한다)

    @Delete
    fun delete(userProfile: UserProfile)

    @Query("SELECT * FROM userprofile")
    fun getAll() : List<UserProfile>
}

@Database(entities = [UserProfile::class], version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun userProfileDao() : UserProfileDao
}