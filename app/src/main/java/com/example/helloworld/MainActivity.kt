package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)
        val myTextView = findViewById<TextView>(R.id.textView)

        var timesButtonPressed = 0
        myButton.setOnClickListener {
            timesButtonPressed++;
            myTextView.text = timesButtonPressed.toString();
            Toast.makeText(this@MainActivity, "Hey Manav!\nYou clicked Me :)", Toast.LENGTH_SHORT).show()
        }
    }
}