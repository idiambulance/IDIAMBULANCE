package com.example.ambulance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InformationActivity : AppCompatActivity() {

    private lateinit var btnDummy2: Button
    private lateinit var tvOilValue : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
    }
}