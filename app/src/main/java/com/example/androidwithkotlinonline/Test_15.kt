package com.example.androidwithkotlinonline

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Test_15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test15)

        var chatList = mutableListOf<CHAT>()
        for (i in 1..50){
            chatList.add(CHAT("" + i + "번째 안녕하세요"))
        }
        val recylcerViewAdapter15 = findViewById<RecyclerView>(R.id.recyclerView15)
        recylcerViewAdapter15.adapter = recyclerViewAdapter(chatList, this)
        recylcerViewAdapter15.layoutManager = LinearLayoutManager(this)
    }
}

class recyclerViewAdapter(
    var chatList : MutableList<CHAT>,
    var context : Context
) : RecyclerView.Adapter<recyclerViewAdapter.ChatViewHolder>() {
    inner class ChatViewHolder(view : View) : RecyclerView.ViewHolder(view) {
            var chatImage = view.findViewById<ImageView>(R.id.chatImage)
            var chatText = view.findViewById<TextView>(R.id.chatText)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChatViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.chat_item_list, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.chatText.text = chatList.get(position).chatText
    }

    override fun getItemCount(): Int {
        return chatList.size
    }
}


class CHAT(val chatText : String) {

}