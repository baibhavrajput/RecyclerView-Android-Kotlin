package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList : List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewoHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list_items, parent,false)

        return ViewoHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewoHolder, position: Int) {

        val ItemsViewModel = mList[position]

        holder.imageView.setImageResource(ItemsViewModel.image)
        holder.name.text = ItemsViewModel.name
        holder.message.text = ItemsViewModel.message

    }

    override fun getItemCount(): Int {

        return  mList.size

    }

    class ViewoHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){

        val imageView : ImageView = itemView.findViewById(R.id.iv_dp)
        val name : TextView = itemView.findViewById(R.id.tv_name)
        val message : TextView = itemView.findViewById(R.id.tv_message)
    }


}