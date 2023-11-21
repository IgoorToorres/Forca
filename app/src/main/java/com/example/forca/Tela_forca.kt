package com.example.forca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import java.util.Locale

class Tela_forca : AppCompatActivity() {

    val forca = Forca()
    lateinit var vidas: TextView
    lateinit var inputLetra : EditText
    lateinit var inputChute : EditText
    lateinit var btnVerificar : Button
    lateinit var palavraSecreta: TextView
    val palavraEscondida: String = forca.getPalavraSecreta()
    lateinit var intentResultado : Intent
    lateinit var caixaInputChute : TextInputLayout
    lateinit var txtCategoria : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_forca)

        inicializarElementos()
        txtCategoria.setText(forca.getCategoria())
        intentResultado = Intent(this,Tela_resultado::class.java)
        vidas.setText("${forca.tentativasRestantes}")

        btnVerificar.setOnClickListener {
            caixaInputChute.error = null

            if (forca.tentativasRestantes > 0 && '_' in forca.palavraAdivinhada){

                var letraDigitada: Char? = inputLetra.text.toString().firstOrNull()
                var chuteDigitado: String? = inputChute.text.toString()
                chuteDigitado = chuteDigitado?.replace("\\s".toRegex(), "")

                if (inputLetra.text != null){
                    if (letraDigitada != null){
                        forca.verificarLetra(letraDigitada)
                        vidas.setText("${forca.tentativasRestantes}")
                        palavraSecreta.setText(forca.palavraAdivinhada.joinToString("  "))
                    }
                }

                if (inputChute.text.length > 1){
                    if(chuteDigitado != null){
                        forca.verificarChute(chuteDigitado)
                        vidas.setText("${forca.tentativasRestantes}")
                        palavraSecreta.setText(forca.palavraAdivinhada.joinToString("  "))
                    }
                }else if (inputChute.text.length == 1){
                    caixaInputChute.error = "seu chute deve conter pelo menos duas letras"
                    caixaInputChute.requestFocus()
                }


            }

            inputLetra.setText("")
            inputChute.setText("")
            verificar()
        }

    }

    fun inicializarElementos(){
        vidas = findViewById(R.id.txt_vidas)
        inputLetra = findViewById(R.id.input_letra)
        inputChute = findViewById(R.id.input_chute)
        btnVerificar = findViewById(R.id.btn_verificar)
        palavraSecreta = findViewById(R.id.palavra_secreta)
        palavraSecreta.setText(forca.palavraAdivinhada.joinToString("  "))
        caixaInputChute = findViewById(R.id.caixa_input_chute)
        txtCategoria = findViewById(R.id.txt_categoria)

    }

    fun verificar(){

        if ('_' !in forca.palavraAdivinhada){
            intentResultado.putExtra("resultado", "Parabens! você acertou")
            intentResultado.putExtra("palavra", palavraEscondida)
            startActivity(intentResultado)
        }else if (forca.tentativasRestantes <= 0){
            intentResultado.putExtra("resultado", "Voce perdeu!")
            intentResultado.putExtra("palavra", palavraEscondida)
            startActivity(intentResultado)
        }

    }
}