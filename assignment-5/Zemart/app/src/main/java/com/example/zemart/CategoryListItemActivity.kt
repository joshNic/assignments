package com.example.zemart

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryListItemActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var categoryItemListAdapter: CategoryItemListAdapter
    private var dataList = mutableListOf<CategoryListItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_items)

        recyclerView = findViewById(R.id.categoryItemsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        categoryItemListAdapter = CategoryItemListAdapter{ position -> onItemClick(position) }
        recyclerView.adapter = categoryItemListAdapter

        recyclerView.addItemDecoration(MarginItemDecoration(3))

        dataList.add(CategoryListItem("Laptop",10.0,"Black",R.drawable.laptop,"#123456","This is a good product"))
        dataList.add(CategoryListItem("Computer",9.0,"Black",R.drawable.computer,"#123445","This is a another great product"))
        dataList.add(CategoryListItem("Camera",11.0,"Black",R.drawable.camera,"#123478","This is a fantastic product"))
        dataList.add(CategoryListItem("Drone",12.0,"Black",R.drawable.drone,"#123490","This is a great drone product"))
        categoryItemListAdapter.setDataList(dataList)
    }



    private fun onItemClick(position: Int) {


        val intent = Intent(applicationContext,DetailScreen::class.java)
        intent.putExtra("title",dataList[position].title)
        intent.putExtra("price","Price: ${dataList[position].price}")
        intent.putExtra("color","Color: ${dataList[position].color}")
        intent.putExtra("desc","Description: \n${dataList[position].desc}")
        intent.putExtra("image","${dataList[position].image}")
        intent.putExtra("itemId",dataList[position].itemId)
        startActivity(intent)
    }
}