package com.example.app3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rview)

        val listOfFruits = getFruits()
        val fruitAdapter = FruitAdapter(listOfFruits)

        recyclerView.adapter = fruitAdapter

    }

    private fun getFruits(): List<Fruit>{
        var fruitsList =  mutableListOf<Fruit>()
        fruitsList.add(Fruit("Apple",R.drawable.apple,"This is an apple"))
        fruitsList.add(Fruit("Banana",R.drawable.banana,"This is a banana"))
        fruitsList.add(Fruit("Strawberry",R.drawable.strawberry,"This is a strawberry"))
        fruitsList.add(Fruit("Star Fruit",R.drawable.starfruit,"This is a starfruit"))
        fruitsList.add(Fruit("Grape",R.drawable.grape,"This is a Grape"))
        fruitsList.add(Fruit("Mango",R.drawable.mango,"This is a mango"))
        fruitsList.add(Fruit("Orange",R.drawable.orange,"This is an orange"))
        fruitsList.add(Fruit("Pineapple",R.drawable.pinapple,"This is a pineapple"))
        fruitsList.add(Fruit("Pincer",R.drawable.pincer,"This is a pincer"))
        fruitsList.add(Fruit("Pumpkin",R.drawable.pumpkin,"This is a Pumpkin"))
        fruitsList.add(Fruit("Watermelon",R.drawable.watermelon,"This is a Watermelon"))
        fruitsList.add(Fruit("Lemon",R.drawable.lemon,"This is a Lemon"))
        fruitsList.add(Fruit("Cherry",R.drawable.cherry,"This is a Cherrys"))
        return fruitsList
    }
}