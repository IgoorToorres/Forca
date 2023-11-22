package com.example.forca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tela_resultado : AppCompatActivity() {

    // Elementos da interface do usuário
    lateinit var btnInicio: Button
    lateinit var txtResultado: TextView
    lateinit var palavraDesafio: TextView
    lateinit var btnJogarNovamente: Button
    lateinit var intentInicio: Intent
    lateinit var intentJogarNovamente: Intent


    // Função chamada na criação da atividade
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        // Inicializa os elementos da interface
        inicializarResultados()

        // Adiciona um listener ao botão de início para retornar à tela principal
        btnInicio.setOnClickListener {
            startActivity(intentInicio)
        }

        //Adiciona um listener ao botao jogar novamente poara jogar novamente
        btnJogarNovamente.setOnClickListener {
            startActivity(intentJogarNovamente)
        }
    }

    // Função para inicializar os elementos da interface e exibir os resultados que foram passados pela classe Tela_forca
    fun inicializarResultados() {
        // Inicializa os elementos da interface a partir do layout
        btnInicio = findViewById(R.id.btn_inicio)
        txtResultado = findViewById(R.id.txt_resultado_final)
        palavraDesafio = findViewById(R.id.palavra_desafio)
        btnJogarNovamente = findViewById(R.id.btn_jogar_novamente)
        intentInicio = Intent(this, MainActivity::class.java)
        intentJogarNovamente = Intent(this, Tela_forca::class.java)


        // Obtém os dados da intent que foram passados pela tela anterior
        val mensagemFinal = intent.getStringExtra("resultado")
        val palavraSecreta = intent.getStringExtra("palavra")

        // Exibe os resultados na interface
        palavraDesafio.text = palavraSecreta
        txtResultado.text = mensagemFinal

    }
}