package com.example.androidwithkotlinonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Test_12_check : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test12_check)

        var phonebookList = mutableListOf<PhoneBook>()
        for (i in 0..40) {
            phonebookList.add(
                PhoneBook("" + i + "번째 사람", "010-1111-111" + i)
            )
        }

        val container = findViewById<LinearLayout>(R.id.container)
        val inflater = LayoutInflater.from(this)
        phonebookList.forEach { phoneBook ->
            val phonebookItem = inflater.inflate(R.layout.activity_phonebook_itemlist, null)
            val image = phonebookItem.findViewById<ImageView>(R.id.image1)
            val name = phonebookItem.findViewById<TextView>(R.id.name1)
            val number = phonebookItem.findViewById<TextView>(R.id.number1)

            image.setImageDrawable(resources.getDrawable(R.drawable.logo_kt, null))
            name.text = phoneBook.name
            number.text = phoneBook.number

            container.addView(phonebookItem)

            phonebookItem.setOnClickListener {
                startActivity(
                    Intent(this, Test_12_check_02::class.java).apply {
                        this.putExtra("name", phoneBook.name)
                        this.putExtra("number", phoneBook.number)
                    }
                )
            }
        }

    }
}


class PhoneBook (val name : String, val number : String)