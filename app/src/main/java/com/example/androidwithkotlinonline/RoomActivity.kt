package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        // 기본적으로 데이터베이스 작업은 메인 쓰레드에서 할 수 없다
        // 이유는, 데이터베이스 작업을 휴대폰이 하는 동안 사용자가 기다려야하기 때문
        // 해결책은, 쓰레드를 이용하거나 async를 이용하면된다
       val database = Room.databaseBuilder(
            applicationContext,
            UserDataBase::class.java,
            "user-database"
        ).allowMainThreadQueries().build() // 메인쓰레드에서 조작하는 것을 허락한다

        findViewById<TextView>(R.id.save).setOnClickListener {
            val userProfile = UserProfile(1, "홍", "길동")
            database.userProfileDao().insert(userProfile)
        }

        findViewById<TextView>(R.id.load).setOnClickListener {
            val userProfiles = database.userProfileDao().getAll()
            userProfiles.forEach {
                Log.d("testt", "" + it.id + it.firstName)
            }
        }

        findViewById<TextView>(R.id.delte).setOnClickListener {
            database.userProfileDao().delete(1)
        }
    }
}

@Entity
class UserProfile(
    @PrimaryKey(autoGenerate = true) val id : Int,  // autoGenerate -> 자동으로 1씩 증가

    @ColumnInfo(name = "last_name")
    val lastName : String,

    @ColumnInfo(name = "first_name")
    val firstName : String
) {
    constructor(lastName: String, firstName: String) : this(0, lastName, firstName)
}

@Dao
interface UserProfileDao {
    // CRUD -> 데이터베이스 조작
    // Query -> 데이터베이스 조회
    @Insert(onConflict = REPLACE) // REPLACE -> 교체한다, IGNORE -> 무시한다
    fun insert(userProfile: UserProfile)

    // SELECT * FROM youtube_youtube WHERE id = 1; (youtube_youtube 테이블에서 id가 1인 모든 컬럼을 선택한다)

    @Query("DELETE FROM userprofile WHERE id = :userId")
    fun delete(userId: Int)

    @Query("SELECT * FROM userprofile")
    fun getAll() : List<UserProfile>
}

@Database(entities = [UserProfile::class], version = 1)
abstract class UserDataBase : RoomDatabase() {
    abstract fun userProfileDao() : UserProfileDao
}