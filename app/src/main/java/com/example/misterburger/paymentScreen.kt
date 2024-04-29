package com.example.misterburger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class paymentScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_screen)

        var paynow = findViewById<Button>(R.id.paynow)
        paynow.setOnClickListener{
            var intent = Intent(this,popupmessagescreen::class.java)
            startActivity(intent)
            finish()
        }
        var arrowsummery = findViewById<ImageView>(R.id.arrowsummery)
        arrowsummery.setOnClickListener{
            var intent = Intent(this,Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }

}