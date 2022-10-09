package com.example.ambulance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class  ToDo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)
    }
}

//Slideout
    //Add slideout to all activities
    //name of batteries link should be changed to power system
    //When you click security nothing seems to happen

//Dashboard
    //Add date and time

// Engine Status
    //Create activity
    //Can we add a speedometer from the internal phone data

//Alerts
    //Can I have a running list of alerts and alarms
    //define needed alerts and alarms for sensors
    //alert for the app not having contact with the

//Startup
    //Low Priority Nothing Needed

//Power System
    //add amperage to the activity

//Environmentals
    //Build out the sensors list later

//Security
    //Add Activity
    //add a sensor for door ajar and compartment ajar
    //Check which compartments alert when opened

//Settings
    //Can we make a setting that allows us to select which activity is opened by default. I think I want two phones each that has a different screen open

//Information
    //update information spreadsheet
    //forum post see if theres any more info missing

//Personal Data
    //Create Activity
    //Picture of Drivers License and Insurance and Registration

//Misc Question and Problems

    //how do you change variables on the gauges ie amps goes from -300 to +300
    //what sensors do the phones i plan on using have. Is it possible for that data to also be uploaded to the webserver
    //can we get gps data is there a way to upload it to the internet so I always know where it is
    //can phone screen turn off when the engine is off and turn itself back on when the vehicle is started. Itll be only used for the ambulance so I dont think security is a concern
    //

//Engine Sensors First Round

    //Fuel Tanks just needs simple ohm reader. simple to build code and instructions here https://www.circuitbasics.com/arduino-ohm-meter/

    //Coolant Sensor should be easy to read also with a ohm reader. WIll have to replace current sensor https://www.autozone.com/engine-management/coolant-temperature-sensor/p/motorcraft-temperature-switch-sw-5130/80062_0_0?spps.s=5069&cmpid=LIA:US:EN:AD:NL:1000000:IGN:8366887415&gclid=CjwKCAjwv4SaBhBPEiwA9YzZvOaArZ3dONPMKd6ebBjhc8cqG0iu_0fG8mHoUEhssAX3r3ccdrXSexoCXWwQAvD_BwE&gclsrc=aw.ds

    //tach sensor is going to need a ac voltage reader doesn't look hard here is the code and parts for it https://solarduino.com/how-to-measure-ac-voltage-with-arduino/#:~:text=Arduino%20has%20the%20ability%20to,MEGA%20has%2016%20input%20pins.

    //Battery 1 Battery 2 and Engine Voltage/Amperage https://dronebotworkshop.com/dc-volt-current/

//Future upgrades

    //oil pressure sending unit https://www.amazon.com/Auto-Meter-2242-Electric-Pressure/dp/B00062YVIY
    //oil temp sensor https://www.amazon.com/Auto-Meter-2253-Electric-Temperature/dp/B004TB9IGI
    //add Exhaust Sensor http://thesensorconnection.com/egt-probes/all-egt-probes/egt-probe-exhaust-gas-temperature-sensor-compact-size-18-diameter
    //Thermocouple amplifier https://www.amazon.com/Adafruit-Universal-Thermocouple-Amplifier-MAX31856/dp/B01LZBBI7D/ref=asc_df_B01LZBBI7D/?tag=hyprod-20&linkCode=df0&hvadid=312184318699&hvpos=&hvnetw=g&hvrand=578081549807262136&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9001844&hvtargid=pla-571139427298&psc=1
    //boost gauge sensor for engine vacuum. easy but low value sensor.
    //research hanes manual regarding dash cluster for possible tie-ins
    //tire pressure sensor
    // 4 bar map sensor for air vacuum
    //fuel flow sending unit
    //add trans and diff temp
    //control engine idle down might be just a turbo
    //add barometric pressure
    //fuel psi
