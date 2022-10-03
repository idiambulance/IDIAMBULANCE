package com.example.ambulance

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.ekn.gruzer.gaugelibrary.ArcGauge
import com.ekn.gruzer.gaugelibrary.HalfGauge
import com.ekn.gruzer.gaugelibrary.Range
import com.google.android.material.navigation.NavigationView


class DashboardMainScreen : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_main_screen)
        setupNavigationMenuStuff()

        //values for the gauges
        val oilGauge = findViewById<HalfGauge>(R.id.oilGauge)
        setupOilGauge(oilGauge)
        oilGauge.value = 45.0

        val coolantGauge = findViewById<HalfGauge>(R.id.coolantGauge)
        setupCoolantGauge(coolantGauge)
        coolantGauge.value = 57.0

        val VoltageGauge = findViewById<HalfGauge>(R.id.VoltageGauge)
        setupVoltageGauge(VoltageGauge)
        VoltageGauge.value = 43.0

        val AmperageGauge = findViewById<HalfGauge>(R.id.AmperageGauge)
        setupAmperageGauge(AmperageGauge)
        AmperageGauge.value = 52.0

        val frontFuelGauge = findViewById<ArcGauge>(R.id.frontFuelGauge)
        setupFuelGauge(frontFuelGauge)
        frontFuelGauge.value = 19.0

        val RearFuelGauge = findViewById<ArcGauge>(R.id.RearFuelGauge)
        setupFuelGauge(RearFuelGauge)
        RearFuelGauge.value = 67.0

        //annette added related to sidemenu
        val mainMenu = findViewById<NavigationView>(R.id.mainMenu)
        mainMenu.setNavigationItemSelectedListener {
            when (it.itemId) {
               // these IDs come from the file activity_main_drawer.xml
                R.id.nav_engine_status -> {
                    Toast.makeText(this, "Engine Status not implemented", Toast.LENGTH_LONG).show()
                }

                R.id.nav_startup -> {
                    startActivity(Intent(this, StartupActivity::class.java))
                }

                R.id.nav_alerts -> {
                    Toast.makeText(this, "Alerts not implemented", Toast.LENGTH_LONG).show()
                }

                R.id.nav_batteries -> {
                    startActivity(Intent(this, BatteriesActivity::class.java))
                }

                R.id.nav_environmental -> {
                    startActivity(Intent(this, EnvironmentalActivity::class.java))
                }

                R.id.nav_settings -> {
                    startActivity(Intent(this, SettingsActivity::class.java))
                }

                R.id.nav_information -> {
                    startActivity(Intent(this, InformationActivity::class.java))
                }

            }
            drawerLayout.closeDrawer(Gravity.LEFT) // closes menu after you click on something
            true
        }

    }

    // keep this function here, related to the menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    private fun setupNavigationMenuStuff() {
        // shouldn't need to change this - configures the main menu - annette

        drawerLayout = findViewById(R.id.my_drawer_layout)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()


        // to make the Navigation drawer icon always appear on the action bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupFuelGauge(myGauge : ArcGauge) {

        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 25.0

        val range2 = Range()
        range2.color = Color.parseColor("#00b20b")
        range2.from = 25.0
        range2.to = 100.0


        myGauge.addRange(range)
        myGauge.addRange(range2)

        myGauge.minValue = 0.0
        myGauge.maxValue = 100.0
    }

    private fun setupOilGauge(myGauge : HalfGauge) {
        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 15.0

        val range2 = Range()
        range2.color = Color.parseColor("#00b20b")
        range2.from = 15.0
        range2.to = 66.66

        val range3 = Range()
        range3.color = Color.parseColor("#00b20b")
        range3.from = 66.6
        range3.to = 100.0

        myGauge.addRange(range)
        myGauge.addRange(range2)
        myGauge.addRange(range3)

        myGauge.minValue = 0.0
        myGauge.maxValue = 100.0

    }

    private fun setupCoolantGauge(myGauge : HalfGauge) {
        val range = Range()
        range.color = Color.parseColor("#00b20b")
        range.from = 0.0
        range.to = 85.0

        val range2 = Range()
        range2.color = Color.parseColor("#ce0000")
        range2.from = 85.0
        range2.to = 100.0

        myGauge.addRange(range)
        myGauge.addRange(range2)

        myGauge.minValue = 0.0
        myGauge.maxValue = 100.0

    }

    private fun setupVoltageGauge(myGauge : HalfGauge) {
        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 15.0

        val range2 = Range()
        range2.color = Color.parseColor("#00b20b")
        range2.from = 15.0
        range2.to = 85.0

        val range3 = Range()
        range3.color = Color.parseColor("#ce0000")
        range3.from = 85.0
        range3.to = 100.0

        myGauge.addRange(range)
        myGauge.addRange(range2)
        myGauge.addRange(range3)

        myGauge.minValue = 0.0
        myGauge.maxValue = 100.0

    }

    private fun setupAmperageGauge(myGauge : HalfGauge) {
        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 25.0

        val range2 = Range()
        range2.color = Color.parseColor("#00b20b")
        range2.from = 25.0
        range2.to = 75.0

        val range3 = Range()
        range3.color = Color.parseColor("#ce0000")
        range3.from = 75.0
        range3.to = 100.0

        myGauge.addRange(range)
        myGauge.addRange(range2)
        myGauge.addRange(range3)

        myGauge.minValue = 0.0
        myGauge.maxValue = 100.0

    }


}