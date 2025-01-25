package com.example.gamegeeks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        // Get references to the EditText and Button
        val usernameEditText: EditText = findViewById(R.id.editTextname)
        val submitButton: Button = findViewById(R.id.btnstart1)

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            // Get the username from the EditText
            val username = usernameEditText.text.toString()
            // Create an Intent to start the second activity
            val intent = Intent(this, welcome_screen::class.java)
            // Pass the username to the second activity
            intent.putExtra("USERNAME", username)
            startActivity(intent)


        }

    }
}
