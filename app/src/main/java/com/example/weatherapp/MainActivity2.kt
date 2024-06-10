package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private val temperatures = arrayOf(22, 20, 18, 25, 21, 27, 19)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val avgTempText: TextView = findViewById(R.id.avgTempText)
        val btnViewDetails: Button = findViewById(R.id.btnViewDetails)
        val btnClearData: Button = findViewById(R.id.btnClearData)
        val btnExit: Button = findViewById(R.id.btnExit2)

        avgTempText.text = "Average Temp for the Week: ${calculateAverageTemp()}°C"

        btnViewDetails.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        btnClearData.setOnClickListener {
            Toast.makeText(this, "Data cleared. Please restart the app.", Toast.LENGTH_SHORT).show()
        }

        btnExit.setOnClickListener {
            finish()
        }
    }

    private fun calculateAverageTemp(): Int {
        var total = 0
        for (temp in temperatures) {
            total += temp
        }
        return total / temperatures.size
    }
}
