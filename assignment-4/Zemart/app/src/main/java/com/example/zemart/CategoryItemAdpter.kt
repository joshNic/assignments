package com.example.zemart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryItemAdpter(private val onItemClick: (position: Int) -> Unit):RecyclerView.Adapter<CategoryItemAdpter.ViewHolder>() {

    var dataList = emptyList<Category>()

    internal fun setDataList(dataList:List<Category>){
        this.dataList = dataList
    }

    class ViewHolder(itemView: View,private val onItemClicked: (position: Int) -> Unit):RecyclerView.ViewHolder(itemView), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        var image:ImageView
        var title:TextView

        init {
            image=itemView.findViewById(R.id.image)
            title=itemView.findViewById(R.id.title)
        }

        override fun onClick(v: View) {
            val position = adapterPosition
            onItemClicked(position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemAdpter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.category_item,parent,false)
        return ViewHolder(view,onItemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var data = dataList[position]
        holder.title.text=data.title
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}