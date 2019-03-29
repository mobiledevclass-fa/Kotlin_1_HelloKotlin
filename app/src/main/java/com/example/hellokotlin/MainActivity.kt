package com.example.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_textview.text = "Hello from Kotlin!"

        main_button.setOnClickListener {
            main_textview.text = "Button is pressed"
        }
    }
}
