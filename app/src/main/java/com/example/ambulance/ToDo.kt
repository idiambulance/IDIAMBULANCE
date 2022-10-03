package com.example.ambulance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ToDo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)
    }
}
//Items to Fix in the App
//name of batteries link should be changed to power system
//add the dropdown to all the pages/should it be a master value
//add date and time to dashboard
//how do you change variables on the gauges ie amps goes from -300 to +300
//investigate boost gauge sensor for adding to the list
//research hanes manual regarding dash cluster for possible tie-ins
//look at getting a hanes manual maybe the tie in point is in the cluster
//define needed alerts and alarms
//tire pressure sensor
// 4 bar map sensor for air vacuum
//fuel flow sending unit
//trans and diff temp
//control engine idle down might be just a turbo
//add barometric pressure




//oil sending unit https://www.amazon.com/Auto-Meter-2242-Electric-Pressure/dp/B00062YVIY
//oil temp sensor https://www.amazon.com/Auto-Meter-2253-Electric-Temperature/dp/B004TB9IGI
//Exhaust Sensor http://thesensorconnection.com/egt-probes/all-egt-probes/egt-probe-exhaust-gas-temperature-sensor-compact-size-18-diameter
//Thermocouple amplifier https://www.amazon.com/Adafruit-Universal-Thermocouple-Amplifier-MAX31856/dp/B01LZBBI7D/ref=asc_df_B01LZBBI7D/?tag=hyprod-20&linkCode=df0&hvadid=312184318699&hvpos=&hvnetw=g&hvrand=578081549807262136&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9001844&hvtargid=pla-571139427298&psc=1
//tach sensor is going to need a ac voltage and/or hertz
//FIRST RUN boost gauge sensor for engine vacuum. easy but low value sensor.
//FIRST RUNG fuel tanks will need a ohm sensors. should be the first sensor done
//FIRST RUNG coolant gauge will need a ohm sensor. Gotta replace anyways.
//speedometer is a mechanical cable looks to be difficult








