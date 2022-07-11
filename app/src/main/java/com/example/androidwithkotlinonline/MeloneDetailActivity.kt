package com.example.androidwithkotlinonline

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class MeloneDetailActivity : AppCompatActivity() {

    lateinit var playPauseButton : ImageView
    var is_playing : Boolean = false
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
        setContentView(R.layout.activity_melone_detail)

        playPauseButton = findViewById(R.id.play)
        playPauseButton.setOnClickListener {
            if (is_playing == true) is_playing = false
            else is_playing = true
        }


        melonItemList = intent.getSerializableExtra("melon_item_list") as ArrayList<MelonItem>

    }
}