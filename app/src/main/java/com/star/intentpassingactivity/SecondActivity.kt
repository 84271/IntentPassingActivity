package com.star.intentpassingactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    var name: String =""
    var age: String =""
    var gender: String =""
    var email: String =""
    var number: String =""
    var salary: String =""
    var info: String =""

    lateinit var tvName: TextView
    lateinit var tvAge: TextView
    lateinit var tvGender: TextView
    lateinit var tvMail: TextView
    lateinit var tvNumber: TextView
    lateinit var tvSalary: TextView
    lateinit var tvInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvAge = findViewById(R.id.tvAge)
        tvMail = findViewById(R.id.tvMail)

        intent?.let{
            //  val name = intent.getDoubleExtra("Name",_)
            val age = intent.getIntExtra("Age",0)
            // val gender = intent.getCharExtra("Gender")
            val email = intent.getStringExtra("Email").toString()
            // val number = intent.getLongExtra("Number")
            // val salary = intent.getFloatExtra("Salary")
            // val info = intent.getBooleanExtra("Info")

            tvMail = findViewById(R.id.tvMail)
            tvMail.setText(email)

        }
    }
}