package com.rajendra.jetpackviewmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    private lateinit var getData: GetData
    private lateinit var count:TextView
    private lateinit var getCount:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = findViewById(R.id.count)
        getCount = findViewById(R.id.get_count)

        //getData = GetData()
        getData = ViewModelProviders.of(this).get(GetData::class.java)
        count.text = getData.totalCount.toString()

        getCount.setOnClickListener {
            count.text = getData.getCount().toString()

        }

    }
}