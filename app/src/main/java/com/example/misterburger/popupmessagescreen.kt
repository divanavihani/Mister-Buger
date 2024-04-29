package com.example.misterburger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class popupmessagescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popupmessagescreen)

        var goback = findViewById<Button>(R.id.goback)
        goback.setOnClickListener{
            var intent = Intent(this,Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }

}