package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Test_15_check : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test15_check)

        val chatList = mutableListOf<Chat_Test>()
        chatList.add(Chat_Test("안녕하세요", false))
        chatList.add(Chat_Test("안녕하세요", true))
        chatList.add(Chat_Test("안녕하세요", false))
        chatList.add(Chat_Test("안녕하세요", true))
        chatList.add(Chat_Test("안녕하세요", false))
        chatList.add(Chat_Test("안녕하세요", false))
        chatList.add(Chat_Test("안녕하세요", false))
        chatList.add(Chat_Test("안녕하세요", false))
        chatList.add(Chat_Test("안녕하세요", true))

        with(findViewById<RecyclerView>(R.id.chatRecyclerView)) {
            this.layoutManager = LinearLayoutManager(this@Test_15_check)
            this.adapter = ChatRecyclerAdapter(
                chatList = chatList,
                inflater = LayoutInflater.from(this@Test_15_check)
            )
        }
    }
}

class ChatRecyclerAdapter(
    val chatList : MutableList<Chat_Test>,
    val inflater : LayoutInflater
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val textView : TextView
        init {
            textView = itemView.findViewById(R.id.chatTextRight)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = inflater.inflate(R.layout.chat_item_right, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = chatList.get(position)
        (holder as ViewHolder).textView.text = chat.message
    }

    override fun getItemCount(): Int {
        return chatList.size
    }
}

class Chat_Test(val message : String, val is_right : Boolean) {

}