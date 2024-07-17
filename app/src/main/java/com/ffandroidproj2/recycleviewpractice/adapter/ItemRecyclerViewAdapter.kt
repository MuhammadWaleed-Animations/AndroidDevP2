package com.ffandroidproj2.recycleviewpractice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ffandroidproj2.recycleviewpractice.R
import com.ffandroidproj2.recycleviewpractice.model.ItemModel


class ItemRecyclerViewAdapter(private val mlist: List<ItemModel>):RecyclerView.Adapter<ItemRecyclerViewAdapter.ViewHolder>(){


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = this.itemView.findViewById(R.id.itemIcon)
        val textView: TextView = this.itemView.findViewById<TextView>(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemModel = mlist[position]
        holder.imageView.setImageResource(itemModel.image)
        holder.textView.text = itemModel.text

    }
}