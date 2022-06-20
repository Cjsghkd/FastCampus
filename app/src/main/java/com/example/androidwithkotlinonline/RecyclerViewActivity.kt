package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatViewInflater
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val carList = mutableListOf<Car>()
        for (i in 0..100) {
            carList.add(Car("" + i + "번째 자동차", "" + i + "번째 엔진"))
        }
    }
}

class RecylcerViewAdapter(
    // outer class
    var carList : MutableList<Car>,
    var inflater: LayoutInflater
):RecyclerView.Adapter<RecylcerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        // inner class
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }
}