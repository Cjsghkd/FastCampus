package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListViewActivity_13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view13)

        // 데이터 준비
        var carList = mutableListOf<Car>()
        for (i in 0..100) {
            carList.add(Car("" + i + "번째 자동차", "" + i + "번째 엔진"))
        }

    }
}

class ListViewAdapter(
    val carList : MutableList<Car>,
    val layoutInflater: LayoutInflater
) : BaseAdapter() {
    override fun getCount(): Int {
        // 전체 데이터의 크기(갯수) 리턴
    }

    override fun getItem(p0: Int): Any {
        // 전체 데이터 중에서 해당번째(position)의 데이터 리턴
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // 해당 번째 뷰를 리턴
    }
}