package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello World")

        var num1 = 5
        var num2 = 10

        for (i in 0..10) {
            if (num1 > num2) {
                println(sum(num1, num2))
            } else if (num1 == num2) {
                println(multi(num1, num2))
            } else {
                println(sub(num1, num2))
            }

            num1+=i
        }

        println("Thank you")

    }
    fun sub (num1 : Int , num2 : Int) : Int {
     return num2-num1
    }
    fun sum (num1 : Int , num2 : Int) : Int {
        return num1+num2
    }
    fun multi (num1 : Int , num2 : Int) : Int {
        return num1+num2
    }
}