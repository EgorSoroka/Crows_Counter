package com.george.crows_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var countCat: Int = 0
    private var enough: Int = 0

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
            enough++
            hello.text = when(enough){
                1 -> "Кто здесь??!!"
                2 -> "Так все же кто-то есть??"
                3 -> "Хаха!!! Щекотно!"
                6 -> "Может хватит??"
                9 -> "Это уже не смешно!!"
                15 -> "Довольно!!!"
                30 -> "Хваааааатииииит!!!!!!111!!"
                else -> "....."
            }

        }

        buttonCount.setOnClickListener(){
            textHello.text = "Я насчитал ${++counter} ворон"
        }

        buttonCat.setOnClickListener(){
            textCat.text = "Я насчитал ${++countCat} котов!"
        }
    }
}