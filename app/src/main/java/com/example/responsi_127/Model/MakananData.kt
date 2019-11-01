package com.example.responsi_127.Model

import com.example.responsi_127.R

object MakananData {
    private val makananName = arrayOf(
        "Bika Ambon",
        "Gado - gado",
        "Kerak Telur",
        "Nasi Goreng",
        "Opor",
        "Pempek",
        "Rendang",
        "Sate",
        "Sop Buntut",
        "Soto"
    )

    private val detail = arrayOf(
        "Makanan Khas Indonesia - Bika Ambon",
        "Makanan Khas Indonesia - Gado gado",
        "Makanan Khas Indonesia - Kerak Telur",
        "Makanan Khas Indonesia - Nasi Goreng",
        "Makanan Khas Indonesia - Opor",
        "Makanan Khas Indonesia - Pempek",
        "Makanan Khas Indonesia - Rendang",
        "Makanan Khas Indonesia - Sate",
        "Makanan Khas Indonesia - Sop Buntut",
        "Makanan Khas Indonesia - Soto"
    )

    private val makananPoster= intArrayOf(
        R.drawable.bika_ambon,
        R.drawable.gado_gado,
        R.drawable.kerak_telur,
        R.drawable.nasi_goreng,
        R.drawable.opor,
        R.drawable.pempek,
        R.drawable.rendang,
        R.drawable.sate,
        R.drawable.sop_buntut,
        R.drawable.soto
    )

    val listMakanan: ArrayList<Makanan>
        get() {
            val list = arrayListOf<Makanan>()
            for (position in makananName.indices) {
                val makanan = Makanan()
                makanan.name = makananName[position]
                makanan.detail = detail[position]
                makanan.poster = makananPoster[position]
                list.add(makanan)
            }
            return list
        }
}