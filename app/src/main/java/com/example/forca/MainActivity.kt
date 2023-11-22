package com.example.forca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // Declarando a variável para o botão de iniciar
    lateinit var btnIniciar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criando uma Intent para iniciar a Tela_forca
        val intentForca = Intent(this, Tela_forca::class.java)

        // Inicializando o botão de iniciar a partir do layout
        btnIniciar = findViewById(R.id.btn_iniciar)

        // Adicionando um listener ao botão de iniciar
        btnIniciar.setOnClickListener {
            // Iniciando a Tela_forca
            startActivity(intentForca)
        }

    }
}