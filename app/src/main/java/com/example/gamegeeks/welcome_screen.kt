package com.example.gamegeeks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class welcome_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        // Get the username passed from the MainActivity
        val username = intent.getStringExtra("USERNAME") ?: "Guest" // Default to "Guest" if null

        // Reference to the TextView to display the welcome message
        val welcomeTextView: TextView = findViewById(R.id.inputName)

        // Display the welcome message with the username
        welcomeTextView.text = "Hello, $username!"
    }
}
