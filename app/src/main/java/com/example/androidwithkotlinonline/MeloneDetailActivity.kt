package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MeloneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melone_detail)

        val melonItemList = intent.getSerializableExtra("melon_item_list") as ArrayList<MelonItem>
        melonItemList.forEach {
            Log.d("melonn", it.song)
        }
    }
}