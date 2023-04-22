package com.example.saveeble.ble

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.saveeble.R

class BleActivity : AppCompatActivity() {

    lateinit var boutonGoBlePage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ble)
        boutonGoBlePage = findViewById(R.id.buttonBluetooth)
        val intent = Intent(this, BleScanActivity::class.java)

        boutonGoBlePage.setOnClickListener{
            startActivity(intent)
        }
    }
}