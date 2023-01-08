package com.example.homework2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0;
        val randomIntent = Intent(this, Activity2::class.java)
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            textView.text = textView.text.subSequence(0, 9).toString() + count.toString();
            randomIntent.putExtra("some_count", count)
            count++;
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            startActivity(randomIntent)
        }
    }
}