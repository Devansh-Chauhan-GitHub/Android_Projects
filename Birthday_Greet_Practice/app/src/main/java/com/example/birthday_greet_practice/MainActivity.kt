package com.example.birthday_greet_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = findViewById<TextView>(R.id.nameInput).editableText.toString()
        Toast.makeText(this, "Name is $name", Toast.LENGTH_SHORT).show()
        val intent =Intent(this,BirthdayCardActivity::class.java)
        intent.putExtra(BirthdayCardActivity.NAMEEXTRA,name)
        startActivity(intent)
    }

}