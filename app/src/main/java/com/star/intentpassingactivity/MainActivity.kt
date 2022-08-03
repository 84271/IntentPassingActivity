package com.star.intentpassingactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var etGender: EditText
    lateinit var etMail: EditText
    lateinit var etNumber: EditText
    lateinit var etSalary: EditText
    lateinit var etInfo: EditText
    lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        etGender = findViewById(R.id.etGender)
        etMail = findViewById(R.id.etMail)
        etNumber = findViewById(R.id.etNumber)
        etSalary = findViewById(R.id.etSalary)
        etInfo = findViewById(R.id.etInfo)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            System.out.println("REGISTER CLICKED")
            var name = etName.text.toString().toString()
            var age = etAge.text.toString().toInt()
            var gender = etGender.text.toString().toCharArray()
            var email = etMail.text.toString().toLong()
            var number = etNumber.text.toString()
            var salary = etSalary.text.toString().toFloat()
            var info = etInfo.text.toString().toBoolean()

            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name",  etName.text.toString().toString()
                    intent.putExtra("age", etAge.text.toString().toInt()
            intent.putExtra("gender", etGender.text.toString().toCharArray()

            intent.putExtra("mail", etMail.text.toString().toLong()
            intent.putExtra("number",  etNumber.text.toString()
            intent.putExtra("salary", etSalary.text.toString().toFloat()
            intent.putExtra("info", etInfo.text.toString().toBoolean()
            startActivity(intent)
        }
    }
}
