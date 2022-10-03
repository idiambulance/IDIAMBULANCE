package com.example.ambulance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {

    private lateinit var btnDummy2: Button
    private lateinit var tvOilValue : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        btnDummy2 = findViewById(R.id.dummyBtn2)
        tvOilValue = findViewById(R.id.oilValue)

        btnDummy2.setOnClickListener {
            // the code we write in here, happens when the button is clicked
            tvOilValue.text = "Gotit"



        }
    }
}