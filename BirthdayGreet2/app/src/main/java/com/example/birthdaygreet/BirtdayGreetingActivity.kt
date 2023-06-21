package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirtdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birtday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        findViewById<TextView>(R.id.BirthdayGreeting).text = "HAPPY BIRTHDAY\n$name"
    }

}