package com.example.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<Button>(R.id.myButton)

        myButton.setOnClickListener {
            Toast.makeText(applicationContext, "Nama saya Asrizal Nova Akhsanu", Toast.LENGTH_SHORT).show()
        }

    }

}
