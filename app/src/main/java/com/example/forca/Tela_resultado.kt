package com.example.forca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tela_resultado : AppCompatActivity() {

    lateinit var btnInicio: Button
    lateinit var txtResultado: TextView
    lateinit var palavraDesafio: TextView
    lateinit var intentInicio: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        inicializarResultados()
        btnInicio.setOnClickListener {
            startActivity(intentInicio)
        }
    }

    fun inicializarResultados() {
        btnInicio = findViewById(R.id.btn_inicio)
        txtResultado = findViewById(R.id.txt_resultado_final)
        palavraDesafio = findViewById(R.id.palavra_desafio)
        intentInicio = Intent(this, MainActivity::class.java)

        val mensagemFinal = intent.getStringExtra("resultado")
        val palavraSecreta = intent.getStringExtra("palavra")

        palavraDesafio.text = palavraSecreta
        txtResultado.text = mensagemFinal

    }
}