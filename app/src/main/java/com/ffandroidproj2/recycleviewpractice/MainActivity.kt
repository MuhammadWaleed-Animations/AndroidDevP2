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
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Burger", price = "7.95$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Pizza", price = "15.80$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Pasta", price = "12.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Sushi", price = "18.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Salad", price = "8.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Sandwich", price = "5.75$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Steak", price = "25.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Fries", price = "3.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Ice Cream", price = "4.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Coffee", price = "2.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Tea", price = "2.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Hot Chocolate", price = "3.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Cake", price = "6.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Pastry", price = "3.75$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Smoothie", price = "5.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Juice", price = "3.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Cocktail", price = "7.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Beer", price = "4.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Wine", price = "8.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Whiskey", price = "12.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Water", price = "1.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Soda", price = "2.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Energy Drink", price = "3.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Milkshake", price = "4.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Tacos", price = "6.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Burrito", price = "7.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Nachos", price = "5.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Quesadilla", price = "6.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Enchilada", price = "7.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Chips", price = "2.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Guacamole", price = "3.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Hummus", price = "4.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Falafel", price = "5.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Shawarma", price = "6.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Kebab", price = "7.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Curry", price = "8.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Rice", price = "2.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Noodles", price = "5.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Dumplings", price = "6.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Spring Rolls", price = "4.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Tofu", price = "3.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Miso Soup", price = "2.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Pho", price = "7.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Ramen", price = "8.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Soba", price = "6.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Tempura", price = "7.5$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Bento", price = "9.0$"))
        itemList.add(ItemModel(image = R.drawable.pfp, text = "Gyoza", price = "5.5$"))


        itemRecyclerViewAdapter = ItemRecyclerViewAdapter(itemList)
        itemRecyclerView.adapter = itemRecyclerViewAdapter
    }
}
