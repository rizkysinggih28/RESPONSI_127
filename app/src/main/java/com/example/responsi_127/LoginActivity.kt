package com.example.responsi_127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_sign_up.setOnClickListener(){
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val username: EditText = findViewById(R.id.l_et_username)
        val password: EditText = findViewById(R.id.l_et_password)

        val isi_nama = intent.getStringExtra("Nama")
        val isi_user = intent.getStringExtra("Username")
        val isi_pass = intent.getStringExtra("Password")

        btn_login.setOnClickListener(){
            if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                Toast.makeText(this, "Username atau Password tidak boleh Kosong", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username.getText().toString() == intent.getStringExtra("Username") && password.getText().toString() == intent.getStringExtra("Password")){
                intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("Nama1", isi_nama.toString())
                intent.putExtra("Username1", isi_user.toString())
                intent.putExtra("Password1", isi_pass.toString())
                startActivity(intent)
            } else if (username.getText().toString() != intent.getStringExtra("Username") || password.getText().toString() != intent.getStringExtra("Password")){
                Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }
}
