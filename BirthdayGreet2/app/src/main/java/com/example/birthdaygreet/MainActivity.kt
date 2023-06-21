package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun createBirthdayCard(view: View) {
//        val name = findViewById<TextView>(R.id.nameInput).editableText.toString()
//        Toast.makeText(this, "Name is $name", Toast.LENGTH_SHORT).show()

        val name =findViewById<TextView>(R.id.nameInput).editableText.toString()

        val intent = Intent(this,BirtdayGreetingActivity::class.java)
        intent.putExtra(BirtdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }


}