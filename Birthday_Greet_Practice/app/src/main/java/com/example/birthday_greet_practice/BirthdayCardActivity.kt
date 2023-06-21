package com.example.birthday_greet_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayCardActivity : AppCompatActivity() {
    companion object{
        const val NAMEEXTRA ="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)
        val name = intent.getStringExtra(NAMEEXTRA)
        findViewById<TextView>(R.id.textView).text="HAPPY BIRTHDAY\n$name"
    }
}