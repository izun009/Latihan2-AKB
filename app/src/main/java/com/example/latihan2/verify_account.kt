package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_verify_account.*

class verify_account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_account)

        var i = intent
        val userName = i.getStringExtra("User")
        val bloodT = i.getStringExtra("Blood_Type")

        btn_send.setOnClickListener {
            val kode = text_verify.text.toString()
            if (kode.isEmpty()){
                Toast.makeText(this, "Isi Kode Anda", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, Profile::class.java)
            intent.putExtra("User",userName)
            intent.putExtra("Blood_Type", bloodT)
            startActivity(intent)

        }
    }
}
