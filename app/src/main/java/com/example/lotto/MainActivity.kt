package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnConstellation = findViewById<CardView>(R.id.btnConstellation)
        val btnName = findViewById<CardView>(R.id.btnName)

        btnConstellation.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }

        btnName.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}