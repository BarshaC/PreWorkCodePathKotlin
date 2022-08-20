package com.example.prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello = findViewById<Button>(R.id.btnClickForToast)
        btnHello.setOnClickListener {
            Log.v("Hello World","Hello World")
            Toast.makeText(this, "Hello to you!", Toast.LENGTH_SHORT).show()
        }
    }
}