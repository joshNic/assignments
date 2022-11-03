package com.example.zemart

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailScreen : AppCompatActivity() {
    private lateinit var image: ImageView

    private lateinit var title: TextView
    private lateinit var color: TextView
    private lateinit var itemId: TextView
    private lateinit var description: TextView
    private lateinit var price: TextView

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail)


        image = findViewById(R.id.image)
        title = findViewById(R.id.title)
        price = findViewById(R.id.price)
        color = findViewById(R.id.color)
        itemId = findViewById(R.id.itemId)
        description = findViewById(R.id.desc)

        title.text =intent.getStringExtra("title")
        color.text = intent.getStringExtra("color")
        price.text = intent.getStringExtra("price")
        itemId.text = intent.getStringExtra("itemId")
        description.text = intent.getStringExtra("desc")
        image.setImageResource(Integer.parseInt(intent.getStringExtra("image")))

    }
}