package com.example.prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var  string: String
        val btnHello = findViewById<Button>(R.id.btnClickForToast)
        var etName: EditText = findViewById<EditText>(R.id.etName)
        btnHello.setOnClickListener {
            string = etName.text.toString();
            Log.v("Hello World", "Hello $string");
            Toast.makeText(this, "Hello $string", Toast.LENGTH_SHORT).show()
        }
    }
}