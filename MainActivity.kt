package com.example.finaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val imgCelebrity = findViewById<ImageView>(R.id.imgCelebrity) // Add ImageView
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..19 -> "Young"
                    in 20..24 -> "Aaliyah"
                    in 25..29 -> "Lebo Mathosa"
                    in 30..39 -> "Princess Diana"
                    in 40..49 -> "Whitney Houston"
                    in 50..59 -> "Michael Jackson"
                    in 60..69 -> "David Bowie"
                    in 70..79 -> "Muhammad Ali"
                    in 80..89 -> "Maya Angelou"
                    in 90..94 -> "Hugh Hefner"
                    in 95..99 -> "Nelson Mandela"
                    else -> "Old"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "Young" -> "You are too young."
                        "Aaliyah" -> "You are in the Aaliyah category. She was 22 when she dead."
                        "Lebo Mathosa" -> "You are in the Lebo Mathosa category. She was 29 when she dead."
                        "Princess Diana" -> "You are in the Princess Diana category. She was 36 when she dead."
                        "Whitney Houston" -> "You are in the Whitney Houston. She was 48 when she dead."
                        "Michael Jackson" -> "You are in the Michael Jackson. He was 50 when he dead."
                        "David Bowie" -> "You are in the David Bowie category. He was 69 when he dead."
                        "Muhammad Ali" -> "You are in the Muhammad Ali category. He was 74 when he dead."
                        "Maya Angelou" -> "You are in the Maya Angelou category. She was 86 when she dead."
                        "Hugh Hefner" -> "You are in the Hugh Hefner category. He was 91 when he dead."
                        "Nelson Mandela" -> "You are in the Nelson Mandela category. He was 95 when he dead."
                        else -> "You are too old."
                    }
                }"
                // Set image based on result
                val imageResource = when (result) {
                    "Young" -> R.drawable.photo00
                    "Aaliyah" -> R.drawable.photo01
                    "Lebo Mathosa" -> R.drawable.photo02
                    "Princess Diana" -> R.drawable.photo03
                    "Whitney Houston" -> R.drawable.photo04
                    "Michael Jackson" -> R.drawable.photo05
                    "David Bowie" -> R.drawable.photo06
                    "Muhammad Ali" -> R.drawable.photo07
                    "Maya Angelou" -> R.drawable.photo08
                    "Hugh Hefner" -> R.drawable.photo09
                    "Nelson Mandela" -> R.drawable.photo10
                    else -> R.drawable.photo00
                }
                imgCelebrity.setImageResource(imageResource)
            } else {
                txtResult.text = "Please enter a valid age."
            }



        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }

    }
}