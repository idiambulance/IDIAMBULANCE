package com.example.ambulance

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

class ExampleAccelerationActivity : AppCompatActivity() {

    var velocity: Float = 0.0f
    var appliedAcceleration: Float = 0.0f
    var currentAcceleration: Float = 0.0f
    lateinit var lastUpdate: Date
    val handler = Handler()
    private lateinit var tvMph : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_acceleration)
        tvMph = findViewById(R.id.tvMph)

        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        lastUpdate = Date(System.currentTimeMillis())
        sensorManager.registerListener(object : SensorEventListener {
            var calibration = Double.NaN // "NaN"... "not a number"
            override fun onSensorChanged(p0: SensorEvent?) {
                val x = p0!!.values[0]
                val y = p0.values[1]
                val z = p0.values[2]

                val distance = sqrt(x.toDouble().pow(2.0) + y.toDouble().pow(2.0) + z.toDouble().pow(2.0))
                Log.d("kent","$distance")
                if (calibration.isNaN()) {
                    calibration = distance
                } else {
                    updateVelocity()
                    currentAcceleration = distance.toFloat()
                }

            }

            override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
                    TODO("Not yet implemented")
            }

        }, accelerometer, SensorManager.SENSOR_DELAY_FASTEST)


        val timer = Timer("VelocityUpdate")
        timer.schedule(object: TimerTask() {
            override fun run() {
                // this code runs every 1000ms (see below for that 1000)
                runOnUiThread {updateGui()} // call the method to update the text on the screen with whatever the sesnor has for us
            }

        }, 0, 1000)
    }

    private fun updateVelocity() {
        // Calculate how long this acceleration has been applied.
        val timeNow = Date(System.currentTimeMillis())
        val timeDelta: Long = timeNow.time - lastUpdate.time
        lastUpdate.time = timeNow.time

        // Calculate the change in velocity at the
        // current acceleration since the last update.
        val deltaVelocity = appliedAcceleration * (timeDelta / 1000f)
        appliedAcceleration = currentAcceleration

        // Add the velocity change to the current velocity.
        velocity += deltaVelocity
        Log.d("kent","velocity=$velocity")
    }

    private fun updateGui() {
        val mph =  ((100f * velocity / 1.6 * 3.6))/100f
        Log.d("kent", "mph=$mph")
        handler.post {
            tvMph.text = "MPH $mph"
        }
    }

}