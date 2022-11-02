package com.example.zemart

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShoppingActivity:AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var categoryItemAdapter:CategoryItemAdpter
    private var dataList = mutableListOf<Category>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_activity)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        categoryItemAdapter = CategoryItemAdpter{ position -> onItemClick(position) }
        recyclerView.adapter = categoryItemAdapter

        recyclerView.addItemDecoration(MarginItemDecoration(3))

        dataList.add(Category("Electronics",R.drawable.electronics))
        dataList.add(Category("Clothing",R.drawable.clothing))
        dataList.add(Category("Food",R.drawable.food))
        dataList.add(Category("Beauty",R.drawable.beauty))
        categoryItemAdapter.setDataList(dataList)
    }



    private fun onItemClick(position: Int) {
        Toast.makeText(this, dataList[position].title, Toast.LENGTH_SHORT).show()
    }
}