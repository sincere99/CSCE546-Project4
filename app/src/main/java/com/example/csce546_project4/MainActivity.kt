package com.example.csce546_project4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creates a submit button, edit text for user input, and text view to display output
        val submitButton: Button = findViewById(R.id.submitName)
        val enterName: EditText = findViewById(R.id.enterName)
        val welcomeUser: TextView = findViewById(R.id.welcomeUser)

        //Submits the user input when button is clicked
        submitButton.setOnClickListener {
            // Place input from edit text into a string and displays output
            val name: String = enterName.text.toString()
            welcomeUser.text = "Welcome $name "
        }
    }
}