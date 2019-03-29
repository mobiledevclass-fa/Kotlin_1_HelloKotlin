package com.example.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
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

        main_listview.setOnItemClickListener { parent, view, position, id ->
            main_textview.text = mNameList.get(position).toString() + " is learning Android development!"
        }

        val click = View.OnClickListener {
            override fun onClick(v: View?) {
                if (v != null) {
                    when(v.id) {
                        R.id.ok_btn -> {
                            Toast.makeText(applicationContext, "Нажата кнопка ОК", Toast.LENGTH_LONG).show()
                        }
                        R.id.cnc_btn -> {
                            Toast.makeText(applicationContext, "Нажата кнопка CANCEL", Toast.LENGTH_LONG).show()
                        }
                        else -> {/* do your code */}
                    }
                }
            }
        }

        ok_btn.setOnClickListener(click)
        cnc_btn.setOnClickListener(click)
    }
}
