package com.example.latihan2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            Toast.makeText(this, "Belum Berfungsi", Toast.LENGTH_SHORT).show()
            return@setOnClickListener
        }
        btn_connect.setOnClickListener {
            Toast.makeText(this, "Belum Berfungsi", Toast.LENGTH_SHORT).show()
            return@setOnClickListener
        }

        register.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}

// 10117152 - M Izzudin Wijaya - Created on Wednesday 15 April 2020 13.30
