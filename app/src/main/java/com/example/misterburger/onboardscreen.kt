package com.example.misterburger

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboardscreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardscreen)

        var ob1next = findViewById<Button>(R.id.ob1next)
        ob1next.setOnClickListener{
            var intent = Intent(this,onboardscreen2::class.java)
            startActivity(intent)
            finish()
        }
        var skip = findViewById<Button>(R.id.skip)
        skip.setOnClickListener{
            var intent = Intent(this,Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}