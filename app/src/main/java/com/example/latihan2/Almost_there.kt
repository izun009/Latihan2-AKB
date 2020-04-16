package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Almost_there : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        val position = intent.getIntExtra("position",0)
    }
}
