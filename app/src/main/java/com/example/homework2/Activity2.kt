package com.example.homework2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val count = intent.getIntExtra("some_count", 0)
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = textView.text.toString() + count.toString();
        textView.setOnClickListener {
        }
    }
}