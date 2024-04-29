package com.example.misterburger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class messagescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messagescreen)

        var messagearrow = findViewById<ImageView>(R.id.messagearrow)
        messagearrow.setOnClickListener{
            var intent = Intent(this,Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}