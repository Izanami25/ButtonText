package com.example.buttontext

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.mytext1)
        val submitButton = findViewById<Button>(R.id.button1)
        val dispMessage = findViewById<TextView>(R.id.mytext2)
        submitButton.setOnClickListener {
            dispMessage.setText("Welcome "+Name.text)
        }
    }
}