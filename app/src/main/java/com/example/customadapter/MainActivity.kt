package com.example.customadapter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val studentList = arrayListOf(
            ListModel(R.drawable.img,"Aditya","Shekhpura"),
            ListModel(R.drawable.img,"Deepak","Amnour")
        )
        val customAdapter = CustomAdapter(this,studentList)
        listView.adapter = customAdapter
    }
}