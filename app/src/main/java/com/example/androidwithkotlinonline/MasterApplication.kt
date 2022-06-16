package com.example.androidwithkotlinonline

import android.app.Application
import android.util.Log

class MasterApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("testt", "onCreate")
    }

    override fun onTerminate() {
        super.onTerminate()
    }

}