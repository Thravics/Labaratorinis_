package com.example.tomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nyptukas = findViewById<Button>(R.id.button)
        val tekstas = findViewById<TextView>(R.id.textView)

        nyptukas.setOnClickListener {
            tekstas.setText("Hello World")
        }

    }
}

