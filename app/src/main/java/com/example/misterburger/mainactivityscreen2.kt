package com.example.misterburger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mainactivityscreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainactivityscreen2)

        var ordernow2 = findViewById<Button>(R.id.ordernow2)
        ordernow2.setOnClickListener{
            var intent = Intent(this,paymentScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}