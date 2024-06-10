package com.example.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private val temperatures = arrayOf(22, 20, 18, 25, 21, 27, 19)
    private val conditions = arrayOf("Sunny", "Cloudy", "Rainy", "Sunny", "Partly Cloudy", "Sunny", "Rainy")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailText: TextView = findViewById(R.id.detailText)
        val btnBack: Button = findViewById(R.id.btnBack)

        var detailString = "0"
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

        for (i in temperatures.indices) {
            detailString += "${days[i]}: Min ${temperatures[i]}°C, Max ${temperatures[i]}°C, ${conditions[i]}\n"
        }

        detailText.text = detailString

        btnBack.setOnClickListener {
            finish()
        }
    }
}
