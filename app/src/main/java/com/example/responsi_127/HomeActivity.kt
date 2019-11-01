package com.example.responsi_127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi_127.Adapter.ListMakananAdapter
import com.example.responsi_127.Model.Makanan
import com.example.responsi_127.Model.MakananData
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private lateinit var rvMakanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvMakanan = findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)
        list.addAll(MakananData.listMakanan)
        showMakananList()

        val isi_nama = intent.getStringExtra("Nama1")
        val isi_user = intent.getStringExtra("Username1")
        val isi_pass = intent.getStringExtra("Password1")

        tv_info_account.setOnClickListener(){
            intent = Intent(this, DetailAccountActivity::class.java)
            intent.putExtra("Nama2", isi_nama.toString())
            intent.putExtra("Username2", isi_user.toString())
            intent.putExtra("Password2", isi_pass.toString())
            startActivity(intent)
        }
    }

    private fun showMakananList() {
        rvMakanan.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter= ListMakananAdapter(list)
        rvMakanan.adapter = listMakananAdapter
    }
}
