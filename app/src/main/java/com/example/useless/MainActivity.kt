package com.example.useless

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.click)

        button.setOnClickListener {
            readIt()
        }
    }

    private fun readIt() {

        val message =
            "The button says not to touch it.\n\nGet yourself a pair of glasses! \nYou Nitwit!"

        AlertDialog.Builder(this)
            .setTitle("Warning!")
            .setCancelable(true)
            .setMessage(message)
            .show()
    }
}