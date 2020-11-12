package com.george.crows_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var countCat: Int = 0
    private var enough: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            enough++
            Hello.text = when(enough){
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

        button_counter.setOnClickListener(){
            text_hello.text = "Я насчитал ${++counter} ворон"
        }

        button3.setOnClickListener(){
            text_cat.text = "Я насчитал ${++countCat} котов!"
        }
    }
}