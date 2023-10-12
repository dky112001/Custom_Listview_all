package com.example.customadapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val context:Context,val listArray:ArrayList<ListModel>): BaseAdapter() {
    override fun getCount(): Int {
     return listArray.size
    }

    override fun getItem(p0: Int): Any {
        return listArray[p0]
    }

    override fun getItemId(p0: Int): Long {
       return p0.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       val layout = LayoutInflater.from(context).inflate(R.layout.list_item,null,false)

        val profilePic = layout.findViewById<ImageView>(R.id.profilePic)
        val name = layout.findViewById<TextView>(R.id.name)
        val address = layout.findViewById<TextView>(R.id.address)

        profilePic.setImageResource(listArray[p0].image)
        name.text = listArray[p0].name
        address.text = listArray[p0].address

        return layout
    }
}