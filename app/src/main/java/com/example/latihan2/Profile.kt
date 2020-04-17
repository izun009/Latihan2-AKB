package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var i = intent
        val userName = i.getStringExtra("User")
        val bloodT = i.getStringExtra("Blood_Type")


        val profileName = findViewById<TextView>(R.id.profile_name)
        val profileBlood = findViewById<TextView>(R.id.tipe_blood)

        profileName.text = ""+userName+""
        profileBlood.text = ""+bloodT+""

    }
}
// 10117152 - M Izzudin Wijaya - Created on Friday 17 April 2020 15.12

