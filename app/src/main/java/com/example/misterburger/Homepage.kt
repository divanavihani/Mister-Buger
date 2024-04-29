package com.example.misterburger

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Homepage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        var cheesBurger = findViewById<ImageView>(R.id.cheesBurger)
        cheesBurger.setOnClickListener{
            var intent = Intent(this,activityscreen1::class.java)
            startActivity(intent)
            finish()
        }
        var veggieburger = findViewById<ImageView>(R.id.veggieburger)
        veggieburger.setOnClickListener{
            var intent = Intent(this,mainactivityscreen2::class.java)
            startActivity(intent)
            finish()
        }
        var profilebtn = findViewById<ImageView>(R.id.profilebtn)
        profilebtn.setOnClickListener{
            var intent = Intent(this,profilescreen::class.java)
            startActivity(intent)
            finish()
        }
        var messagebtn = findViewById<ImageView>(R.id.messagebtn)
        messagebtn.setOnClickListener{
            var intent = Intent(this,messagescreen::class.java)
            startActivity(intent)
            finish()
        }
        var Toppings = findViewById<Button>(R.id.Toppings)
        Toppings.setOnClickListener{
            var intent = Intent(this,activityscreen3::class.java)
            startActivity(intent)
            finish()
        }

    }
}