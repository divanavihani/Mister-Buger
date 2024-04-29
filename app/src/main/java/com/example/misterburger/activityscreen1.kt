package com.example.misterburger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activityscreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityscreen1)

        var ordernow1 = findViewById<Button>(R.id.ordernow1)
        ordernow1.setOnClickListener{
            var intent = Intent(this,paymentScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}