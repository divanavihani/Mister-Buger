package com.example.misterburger

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboardscreen2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardscreen2)

        var ob3getstarted = findViewById<Button>(R.id.ob3getstarted)
        ob3getstarted.setOnClickListener{
            var intent = Intent(this,signupscreen::class.java)
            startActivity(intent)
            finish()
        }
        var skip2 = findViewById<Button>(R.id.skip2)
        skip2.setOnClickListener{
            var intent = Intent(this,Homepage::class.java)
            startActivity(intent)
            finish()
        }

    }
}