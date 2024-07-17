package com.ffandroidproj2.recycleviewpractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ffandroidproj2.recycleviewpractice.adapter.ItemRecyclerViewAdapter
import com.ffandroidproj2.recycleviewpractice.model.ItemModel

class MainActivity : AppCompatActivity() {
    private val itemList = ArrayList<ItemModel>()
    private lateinit var itemRecyclerViewAdapter: ItemRecyclerViewAdapter
    private lateinit var itemRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initUI()
    }
    private fun initUI()
    {
        itemRecyclerView = findViewById(R.id.recyclerView)
        itemRecyclerView.layoutManager = LinearLayoutManager(this)
        for(i in 1..100){
            itemList.add(ItemModel(image= R.drawable.pfp, "item $i"))
        }

        itemRecyclerViewAdapter = ItemRecyclerViewAdapter(itemList)
        itemRecyclerView.adapter = itemRecyclerViewAdapter
    }
}
