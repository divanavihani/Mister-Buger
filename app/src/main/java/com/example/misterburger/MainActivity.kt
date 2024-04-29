package com.example.misterburger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       handler.postDelayed({
           val intent = Intent(this,onboardscreen::class.java)
           startActivity(intent)
          finish()
       },2000L)
    }
}