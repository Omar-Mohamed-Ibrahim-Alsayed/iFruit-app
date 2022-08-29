package com.example.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val logo: ImageView = findViewById(R.id.pic)
        val name: TextView = findViewById(R.id.name)
        val description : TextView = findViewById(R.id.description)

        name.text =intent.getStringExtra("name")
        description.text =intent.getStringExtra("desc")
        logo.setImageResource(intent.getIntExtra("logo",0))
    }
}