package com.example.androidwithkotlinonline

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment_01 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflater : xml을 화면에 사용할 준비를 한다 (xml -> view로 만들어준다)
        // container : 프래그먼트에서 사용될 xml의 부모뷰
        // savedInstanceState : 사용 X
        val view =  inflater.inflate(R.layout.fragment_01, container, false)
        // attachToRoot : 루트뷰에 언제 붙일지 (true : 지금, false : 나중에)

        view.findViewById<TextView>(R.id.callActivity).setOnClickListener {
            (activity as FragmentActivity_07).printTestLog()
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data : String? = arguments?.getString("key")
        Log.d("testt", "data is" + data)
    }

    fun printTestLog_a() {
        Log.d("testt", "print test log from fragment")
    }
}