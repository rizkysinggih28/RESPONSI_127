package com.example.responsi_127.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.responsi_127.Model.Makanan
import com.example.responsi_127.R

class ListMakananAdapter(private val listMakanan: ArrayList<Makanan>) : RecyclerView.Adapter<ListMakananAdapter.MakananViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan, parent, false)
        return MakananViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val makanan = listMakanan[position]
        holder.tvName.text = makanan.name
        holder.tvDetail.text = makanan.detail
        Glide.with(holder.itemView.context)
            .load(makanan.poster)
            .into(holder.imgPoster)

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context, listMakanan[holder.adapterPosition].name + " adalah Makanan Khas Indonesia",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    inner class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}