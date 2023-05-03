package com.example.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var number1: TextView
    lateinit var number2:EditText
    lateinit var btn_add:Button
    lateinit var btn_sub:Button
    lateinit var btn_mut:Button
    lateinit var btn_div:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNumbers()
        subtractNumbers()
        divitionNumbers()
        multiplyNumbers()
    }
    fun addNumbers() {
        var num1 = findViewById<TextView>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_add)
        button.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 + addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
    fun subtractNumbers() {
        var num1 = findViewById<TextView>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_sub)
        button.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 + addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplyNumbers() {
        var num1 = findViewById<TextView>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_mut)
        button.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 + addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
    fun divitionNumbers() {
        var num1 = findViewById<TextView>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_div)
        button.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 + addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
}