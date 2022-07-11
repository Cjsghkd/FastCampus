package com.example.androidwithkotlinonline

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MelonDetailActivity : AppCompatActivity() {

    lateinit var playPauseButton : ImageView
    lateinit var mediaPlayer: MediaPlayer
    var position : Int = 0

    var is_playing : Boolean = true
    set(value) {
        if (value == true) {
            playPauseButton.setImageDrawable(this.resources.getDrawable(R.drawable.pause, this.theme))
        } else {
            playPauseButton.setImageDrawable(this.resources.getDrawable(R.drawable.play, this.theme))
        }
        field = value
    }

    lateinit var melonItemList : ArrayList<MelonItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melon_detail)

        melonItemList = intent.getSerializableExtra("melon_item_list") as ArrayList<MelonItem>
        position = intent.getIntExtra("position", 0)

        playMelonItem(melonItemList.get(position))

        playPauseButton = findViewById(R.id.play)
        playPauseButton.setOnClickListener {
            if (is_playing == true) {
                is_playing = false
                mediaPlayer.stop()
            }
            else {
                is_playing = true
                playMelonItem(melonItemList.get(position))
            }
        }
    }

    fun playMelonItem(melonItem : MelonItem) {
        mediaPlayer = MediaPlayer.create(
            this,
            Uri.parse(melonItem.song)
        )
        mediaPlayer.start()
    }
}