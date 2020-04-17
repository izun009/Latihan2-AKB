package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_almost_there.*

class Almost_there : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        var i = intent
        val userName = i.getStringExtra("User")
        val bloodT = i.getStringExtra("Blood_Type")

        btn_verify.setOnClickListener {
            val intent = Intent(this, verify_account::class.java)
            intent.putExtra("User",userName)
            intent.putExtra("Blood_Type", bloodT)
            startActivity(intent)
        }
    }
}
// 10117152 - M Izzudin Wijaya - Created on Wednesday 15 April 2020 16.50

