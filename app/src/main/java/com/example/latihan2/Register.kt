package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*
import kotlinx.android.synthetic.main.activity_register.*
import java.text.ParsePosition

class Register : AppCompatActivity() {

    lateinit var User : EditText
    var BloodType: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val bld = resources.getStringArray(R.array.spinner_blood)
        val rsh = resources.getStringArray(R.array.spinner_reshus)
        val jb = resources.getStringArray(R.array.spinner_job)

//        val spinner1: Spinner = findViewById(R.id.spinner_blood)
//        val spinner2: Spinner = findViewById(R.id.spinner_reshus)

        User = findViewById(R.id.username)
        val tipeblood = findViewById<Spinner>(R.id.blood_spinner)
        val tipereshus = findViewById<Spinner>(R.id.reshus_spinner)
        val tipejob = findViewById<Spinner>(R.id.job_spinner)

//        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>,
//                view: View,
//                position: Int,
//                id: Long
//            ) {
//                spinner.setSelection(position)
//                val selecteditem = parent.getItemAtPosition(position).toString()
//                if (selecteditem == "A"){
//
//
//                val intent = Intent(this, Almost_there::class.java)
//                intent.putExtra("position",position)
//                    startActivity(intent)
//
//            }
//        }

//        User = findViewById(R.id.username)
//        spinner = this.spinner_blood
//        spinner!!.setOnItemSelectedListener(this)
//
//        val aa = ArrayAdapter(this,android.R.layout.simple_spinner_item,spinner1)
//        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner!!.setAdapter(aa)

//        ArrayAdapter.createFromResource(
//            this,
//            R.array.spinner_blood,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            spinner1.adapter = adapter
//        }
//
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.spinner_reshus,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            spinner2.adapter = adapter
//        }

        if (tipeblood != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, bld)
            tipeblood.adapter = adapter

            tipeblood.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ){
                    BloodType = tipeblood.getSelectedItem().toString()
                }
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }

        if (tipereshus != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, rsh)
            tipereshus.adapter = adapter

            tipereshus.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ){
                }
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }

        if (tipejob != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, jb)
            tipejob.adapter = adapter

            tipejob.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ){
                }
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }

//        checkBox_agree.setOnClickListener(View.OnClickListener {
//            if (checkBox_agree.isChecked){
//                Toast.makeText(this, "Anda Menyetujui", Toast.LENGTH_SHORT).show()
//                btn_register.setOnClickListener {
//                 val intent = Intent(this, Almost_there::class.java)
//                    startActivity(intent)
//                }
//            } else {
//                Toast.makeText(this, "Anda Belum Menyetujui", Toast.LENGTH_SHORT).show()
//                return@OnClickListener
//            }
//        })

//        fun onCheckboxClicked(view: View){
//           if (view is CheckBox){
//               val checked: Boolean = view.isChecked
//
//               when(view.id){
//                   R.id.checkBox_agree -> {
//                       if (checked){
//                           Toast.makeText(this, "Anda Menyetujui", Toast.LENGTH_SHORT).show()
//                           btn_register.setOnClickListener {
//                               val intent = Intent(this, Almost_there::class.java)
//                               startActivity(intent)
//                           }
//                       }  else {
//                            Toast.makeText(this, "Anda Belum Menyetujui", Toast.LENGTH_SHORT).show()
//                        }
//                   }
//               }
//           }
//        }

        btn_register.setOnClickListener {
            var user = User.text.toString()
            var bloodtipe = BloodType.toString()

            if (user.equals("")){
                Toast.makeText(this, "Username Harus Diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (bloodtipe.equals("Blood Type")){
                Toast.makeText(this, "Golongan Darah Harus Diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (!checkBox_agree.isChecked){
                Toast.makeText(this, "Anda Belum Menyetujui", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                val intent = Intent(this, Almost_there::class.java)
                intent.putExtra("User",user)
                intent.putExtra("Blood_Type", bloodtipe)
                startActivity(intent)
            }
        }

    }
}
// 10117152 - M Izzudin Wijaya - Created on Friday 17 April 2020 11.23

