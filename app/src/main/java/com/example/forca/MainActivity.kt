package com.example.forca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnIniciar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentForca = Intent(this, Tela_forca::class.java)
        btnIniciar = findViewById(R.id.btn_iniciar)

        btnIniciar.setOnClickListener {
            startActivity(intentForca)
        }

    }
}