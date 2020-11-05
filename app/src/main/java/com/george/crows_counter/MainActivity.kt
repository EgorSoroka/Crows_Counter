package com.george.crows_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var countCat: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val buttonCat = findViewById<Button>(R.id.button3)
        val buttonCount = findViewById<Button>(R.id.button_counter)


        val hello = findViewById<TextView>(R.id.Hello)
        val textHello = findViewById<TextView>(R.id.textHello)
        val textCat = findViewById<TextView>(R.id.text_cat)


        button.setOnClickListener(){
            hello.text = "Кто здесь??!!"

        }

        buttonCount.setOnClickListener(){
            textHello.text = "Я насчитал ${++counter} ворон"
        }

        buttonCat.setOnClickListener(){
            textCat.text = "Я насчитал ${++countCat} котов!"
        }
    }
}