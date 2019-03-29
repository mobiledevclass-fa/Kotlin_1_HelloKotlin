package com.example.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    internal var mNameList = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_textview.text = "Hello from Kotlin!"

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mNameList)
        main_listview.adapter = adapter

        main_button.setOnClickListener {
            // main_textview.text = "Button is pressed"
            mNameList.add(main_edittext.text.toString())
            adapter.notifyDataSetChanged()
        }
    }
}
