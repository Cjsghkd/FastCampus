package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class YoubuteItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_item)

        val videoUrl = intent.getStringExtra("video_url")

        val mediaController = MediaController(this)

        findViewById<VideoView>(R.id.youtube_video_view).apply {
            this.setVideoPath(videoUrl)
            this.requestFocus()
            this.start()
            mediaController.show()
        }
    }

    // ExoPlayer (MediaController 보다 이걸 사용하기도 한다)
    //  - 외부 라이브러리 (구글에서 제작하였다)
    //  - 크게 만들꺼라면 이 기능을 사용하는게 좋다
    //  - 기능이 다양하고 사용이 쉽다
    //  - DRM (저작권?) 사용가능
    //  - Streaming
}