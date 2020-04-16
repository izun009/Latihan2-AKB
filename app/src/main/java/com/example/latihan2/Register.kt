package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    lateinit var User : EditText
    lateinit var Blood : Spinner
    lateinit var cek : CheckBox

//    var spinner1 = arrayOf("Blood Type", "A","B","AB","O")
//    var spinner:Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        val spinner1: Spinner = findViewById(R.id.spinner_blood)
//        val spinner2: Spinner = findViewById(R.id.spinner_reshus)

        val sp_blood = arrayOf("Blood Type", "A","B","AB","O")
        val adapterBlood = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sp_blood)
        val spinner = findViewById(R.id.spinner_blood) as Spinner
        spinner.adapter = adapterBlood

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                spinner.setSelection(position)
                val selecteditem = parent.getItemAtPosition(position).toString()
                if (selecteditem == "A"){


                val intent = Intent(this, Almost_there::class.java)
                intent.putExtra("position",position)
                    startActivity(intent)

            }
        }

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



    }
}
