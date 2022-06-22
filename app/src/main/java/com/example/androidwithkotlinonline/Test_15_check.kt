package com.example.androidwithkotlinonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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

        val adapter = ChatRecyclerAdapter(
            chatList = chatList,
            inflater = LayoutInflater.from(this@Test_15_check)
        )

        with(findViewById<RecyclerView>(R.id.chatRecyclerView)) {
            this.layoutManager = LinearLayoutManager(this@Test_15_check)
            this.adapter = adapter
        }
        findViewById<Button>(R.id.button15).setOnClickListener {
            adapter.chatList.add(2, Chat_Test("두번째 입니다", false))
            adapter.notifyItemInserted(2) // -> 추가 되었을 때
            // adapter.notifyItemChanged  ->  바뀌었을 때
            // adapter.notifyItemRemoved()  ->  삭제 되었을 때
        }
    }
}

class ChatRecyclerAdapter(
    val chatList : MutableList<Chat_Test>,
    val inflater : LayoutInflater
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class RightViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val righttextView : TextView
        init {
            righttextView = itemView.findViewById(R.id.chatTextRight)
        }
    }

    class LeftViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val lefttextView : TextView
        init {
            lefttextView = itemView.findViewById(R.id.chatTextLeft)
        }
    }

    override fun getItemViewType(position: Int): Int {
        when (chatList.get(position).is_right) {
            true -> return 1
            false -> return 0
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            1 -> {
                return RightViewHolder(inflater.inflate(R.layout.chat_item_right, parent, false))
            }
            else -> {
                return LeftViewHolder(inflater.inflate(R.layout.chat_item_left, parent, false))
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = chatList.get(position)
        when (chat.is_right) {
            true -> (holder as RightViewHolder).righttextView.text = chat.message
            false -> (holder as LeftViewHolder).lefttextView.text = chat.message
        }
    }

    override fun getItemCount(): Int {
        return chatList.size
    }
}

class Chat_Test(val message : String, val is_right : Boolean) {

}