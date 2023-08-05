package com.deumolo.pushactivitiesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var pushBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pushBtn = findViewById(R.id.pushBtn)

        pushBtn.setOnClickListener {
            println("Btn pressed")
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}