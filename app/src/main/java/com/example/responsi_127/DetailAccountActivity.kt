package com.example.responsi_127

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail_account.*

class DetailAccountActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_account)

        val tv_nama: TextView = findViewById(R.id.da_tv2_nama)
        val tv_username: TextView = findViewById(R.id.da_tv2_username)
        val tv_password: TextView = findViewById(R.id.da_tv2_password)

        tv_nama.setText(intent.getStringExtra("Nama2"))
        tv_username.setText(intent.getStringExtra("Username2"))
        tv_password.setText(intent.getStringExtra("Password2"))

        btn_back.setOnClickListener(){
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
