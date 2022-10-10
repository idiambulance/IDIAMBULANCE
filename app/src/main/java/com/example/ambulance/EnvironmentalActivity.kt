package com.example.ambulance

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ekn.gruzer.gaugelibrary.ArcGauge
import com.ekn.gruzer.gaugelibrary.HalfGauge
import com.ekn.gruzer.gaugelibrary.Range
import java.security.Guard

class EnvironmentalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_environmental)
        title = "Environmentals"


        val Cabintemp = findViewById<HalfGauge>(R.id.Cabintemp)
        setupTempGauge(Cabintemp)
        Cabintemp.value = 47.0

        val Cabinhumidity = findViewById<HalfGauge>(R.id.Cabinhumidity)
        setupAlternatorGauge(Cabinhumidity)
        Cabinhumidity.value = 56.0

        val Outsidetemp = findViewById<HalfGauge>(R.id.Outsidetemp)
        setupTempGauge(Outsidetemp)
        Outsidetemp.value = 12.0

        val Outsidehumidity = findViewById<HalfGauge>(R.id.Outsidehumidity)
        setupTempGauge(Outsidehumidity)
        Outsidehumidity.value = 30.0

        val Cabinpropane = findViewById<HalfGauge>(R.id.Cabinpropane)
        setupTempGauge(Cabinpropane)
        Cabinpropane.value = 30.0

        val Propanebay = findViewById<HalfGauge>(R.id.Propanebay)
        setupTempGauge(Propanebay)
        Propanebay.value = 30.0

        val Cabinfire = findViewById<HalfGauge>(R.id.Cabinfire)
        setupTempGauge(Cabinfire)
        Cabinfire.value = 30.0

        val Enginefire = findViewById<HalfGauge>(R.id.Enginefire)
        setupTempGauge(Enginefire)
        Cabinfire.value = 30.0

    }

    private fun setupTempGauge(myGauge : HalfGauge) {
        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 12.0

        val range2 = Range()
        range2.color = Color.parseColor("#E3E500")
        range2.from = 12.0
        range2.to = 24.0

        val range3 = Range()
        range3.color = Color.parseColor("#00b20b")
        range3.from = 24.0
        range3.to = 76.0

        val range4 = Range()
        range4.color = Color.parseColor("#E3E500")
        range4.from = 76.0
        range4.to = 88.0

        val range5 = Range()
        range5.color = Color.parseColor("#ce0000")
        range5.from = 88.0
        range5.to = 100.0

        myGauge.addRange(range)
        myGauge.addRange(range2)
        myGauge.addRange(range3)
        myGauge.addRange(range4)
        myGauge.addRange(range5)

        myGauge.minValue = 0.0
        myGauge.maxValue = 100.0

    }

    private fun setupAlternatorGauge(myGauge : HalfGauge) {
        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 12.0

        val range2 = Range()
        range2.color = Color.parseColor("#E3E500")
        range2.from = 12.0
        range2.to = 24.0

        val range3 = Range()
        range3.color = Color.parseColor("#00b20b")
        range3.from = 24.0
        range3.to = 76.0

        val range4 = Range()
        range4.color = Color.parseColor("#E3E500")
        range4.from = 76.0
        range4.to = 88.0

        val range5 = Range()
        range5.color = Color.parseColor("#ce0000")
        range5.from = 88.0
        range5.to = 100.0

        myGauge.addRange(range)
        myGauge.addRange(range2)
        myGauge.addRange(range3)
        myGauge.addRange(range4)
        myGauge.addRange(range5)

        myGauge.minValue = 0.0
        myGauge.maxValue = 100.0

    }

}