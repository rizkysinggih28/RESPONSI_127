package com.example.responsi_127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama: EditText = findViewById(R.id.r_et_nama)
        val username: EditText = findViewById(R.id.r_et_username)
        val password: EditText = findViewById(R.id.r_et_password)

        btn_register.setOnClickListener(){
            intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("Nama", nama.getText().toString())
            intent.putExtra("Username", username.getText().toString())
            intent.putExtra("Password", password.getText().toString())

            if (nama.getText().toString().isEmpty() || username.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                Toast.makeText(this, "Nama, Username atau Password tidak boleh Kosong", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Register is Successful", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}
