package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for(i in 1..20){
            data.add(ItemsViewModel(R.drawable.img_1300031901,"Item"+ i, "Hey, how are you?"))
        }

        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter
    }
}