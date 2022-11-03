package com.example.zemart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryItemListAdapter(private val onItemClick: (position: Int) -> Unit): RecyclerView.Adapter<CategoryItemListAdapter.ViewHolder>() {

    var dataList = emptyList<CategoryListItem>()

    internal fun setDataList(dataList:List<CategoryListItem>){
        this.dataList = dataList
    }

    class ViewHolder(itemView: View, private val onItemClicked: (position: Int) -> Unit):RecyclerView.ViewHolder(itemView), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        var image: ImageView
        var title: TextView
        var price: TextView
        var color: TextView

        init {
            image=itemView.findViewById(R.id.image)
            title=itemView.findViewById(R.id.title)
            price=itemView.findViewById(R.id.price)
            color=itemView.findViewById(R.id.color)
        }

        override fun onClick(v: View) {
            val position = adapterPosition
            onItemClicked(position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemListAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.category_list_item,parent,false)
        return ViewHolder(view,onItemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = dataList[position]
        holder.title.text=data.title
        holder.price.text = "Price: ${data.price}"
        holder.color.text = "Color: ${data.color}"
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}