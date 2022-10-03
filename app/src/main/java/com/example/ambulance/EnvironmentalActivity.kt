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
        title = "Power System"


        val Alternator1Gauge = findViewById<HalfGauge>(R.id.Alternator1Gauge)
        setupAlternatorGauge(Alternator1Gauge)
        Alternator1Gauge.value = 47.0

        val Alternator2Gauge = findViewById<HalfGauge>(R.id.Alternator2Gauge)
        setupAlternatorGauge(Alternator2Gauge)
        Alternator2Gauge.value = 56.0

        val Battery1Gauge = findViewById<HalfGauge>(R.id.Battery1Gauge)
        setupBatteryGauge(Battery1Gauge)
        Battery1Gauge.value = 12.0

        val Battery2Gauge = findViewById<HalfGauge>(R.id.Battery2Gauge)
        setupBatteryGauge(Battery2Gauge)
        Battery2Gauge.value = 30.0

    }

    private fun setupBatteryGauge(myGauge : HalfGauge) {
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