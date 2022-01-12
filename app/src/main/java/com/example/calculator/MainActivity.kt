package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCong.setOnClickListener {
            var resultCong : Double = number1.text.toString().toDouble() + number2.text.toString().toDouble()
            txtResult.text = resultCong.toString()
        }

        btnTru.setOnClickListener {
            var resultTru : Double = number1.text.toString().toDouble() - number2.text.toString().toDouble()
            txtResult.text = resultTru.toString()
        }
        btnNhan.setOnClickListener {
            var resultNhan : Double = number1.text.toString().toDouble() * number2.text.toString().toDouble()
            txtResult.text = resultNhan.toString()
        }
        btnChia.setOnClickListener {
            var resultChia : Double = number1.text.toString().toDouble() / number2.text.toString().toDouble()
            txtResult.text = resultChia.toString()
        }
    }
}