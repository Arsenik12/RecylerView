package com.example.recylerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class detWayang : AppCompatActivity() {
    private lateinit var ivFoto: ImageView
    private lateinit var tvNama: TextView
    private lateinit var tvDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.det_pahlawan)

        ivFoto = findViewById(R.id.ivFoto)
        tvNama = findViewById(R.id.tvNama)
        tvDetail = findViewById(R.id.tvDetail)

        val dataIntent = intent.getParcelableExtra<wayang>("kirimData")
        if (dataIntent != null) {
            Picasso.get().load(dataIntent.foto).into(ivFoto)
            tvNama.text = dataIntent.nama
            tvDetail.text = dataIntent.deskripsi
        }
    }
}
