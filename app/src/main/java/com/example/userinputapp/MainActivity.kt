package com.example.userinputapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var display_text:TextView
    lateinit var userinput_edt:EditText
    lateinit var submit_data:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.TextView)
        userinput_edt = findViewById(R.id.EditText)
        submit_data = findViewById(R.id.btnsubmit)

        submit_data.setOnClickListener {
            //grab user input
            var userData = userinput_edt.text.toString().trim()
            display_text.setText(userData)
        }

    }
}