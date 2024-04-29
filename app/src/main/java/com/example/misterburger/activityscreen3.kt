package com.example.misterburger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activityscreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityscreen3)

        var ordernow3 = findViewById<Button>(R.id.ordernow3)
        ordernow3.setOnClickListener{
            var intent = Intent(this,paymentScreen::class.java)
            startActivity(intent)
            finish()
        }
        var activity3arrow = findViewById<ImageView>(R.id.activity3arrow)
        activity3arrow.setOnClickListener{
            var intent = Intent(this,Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}