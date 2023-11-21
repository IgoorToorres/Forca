package com.example.forca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import java.util.Locale

class Tela_forca : AppCompatActivity() {

    val forca = Forca()
    lateinit var vidas: TextView
    lateinit var inputChute : EditText
    lateinit var btnVerificar : Button
    lateinit var palavraSecreta: TextView
    val palavraEscondida: String = forca.getPalavraSecreta()
    lateinit var intentResultado : Intent
    lateinit var caixaInputChute : TextInputLayout
    lateinit var txtCategoria : TextView
    var letra: Char? = null

    //botoes letras
    lateinit var btnA: ImageButton
    lateinit var btnB: ImageButton
    lateinit var btnC: ImageButton
    lateinit var btnD: ImageButton
    lateinit var btnE: ImageButton
    lateinit var btnF: ImageButton
    lateinit var btnG: ImageButton
    lateinit var btnH: ImageButton
    lateinit var btnI: ImageButton
    lateinit var btnJ: ImageButton
    lateinit var btnK: ImageButton
    lateinit var btnL: ImageButton
    lateinit var btnM: ImageButton
    lateinit var btnN: ImageButton
    lateinit var btnO: ImageButton
    lateinit var btnP: ImageButton
    lateinit var btnQ: ImageButton
    lateinit var btnR: ImageButton
    lateinit var btnS: ImageButton
    lateinit var btnT: ImageButton
    lateinit var btnU: ImageButton
    lateinit var btnV: ImageButton
    lateinit var btnW: ImageButton
    lateinit var btnX: ImageButton
    lateinit var btnY: ImageButton
    lateinit var btnZ: ImageButton
    lateinit var btnAtio: ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_forca)

        inicializarElementos()
        txtCategoria.setText(forca.getCategoria())
        intentResultado = Intent(this,Tela_resultado::class.java)
        vidas.setText("${forca.tentativasRestantes}")


        btnA.setOnClickListener{
            letra = 'A'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnA.setBackgroundResource(R.drawable.letra_a_correta)
            }else{
                btnA.isEnabled = false
                btnA.background = null
            }
        }
        btnB.setOnClickListener{
            letra = 'B'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnB.setBackgroundResource(R.drawable.letra_b_correta)
            }else{
                btnB.isEnabled = false
                btnB.background = null
            }
        }
        btnC.setOnClickListener{
            letra = 'C'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnC.setBackgroundResource(R.drawable.letra_c_correta)
            }else{
                btnC.isEnabled = false
                btnC.background = null
            }
        }
        btnD.setOnClickListener{
            letra = 'D'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnD.setBackgroundResource(R.drawable.letra_d_correta)
            }else{
                btnD.isEnabled = false
                btnD.background = null
            }
        }
        btnE.setOnClickListener{
            letra = 'E'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnE.setBackgroundResource(R.drawable.letra_e_correta)
            }else{
                btnE.isEnabled = false
                btnE.background = null
            }
        }
        btnF.setOnClickListener{
            letra = 'F'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnF.setBackgroundResource(R.drawable.letra_f_correta)
            }else{
                btnF.isEnabled = false
                btnF.background = null
            }
        }
        btnG.setOnClickListener{
            letra = 'G'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnG.setBackgroundResource(R.drawable.letra_g_correta)
            }else{
                btnG.isEnabled = false
                btnG.background = null
            }
        }
        btnH.setOnClickListener{
            letra = 'H'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnH.setBackgroundResource(R.drawable.letra_h_correta)
            }else{
                btnH.isEnabled = false
                btnH.background = null
            }
        }
        btnI.setOnClickListener{
            letra = 'I'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnI.setBackgroundResource(R.drawable.letra_i_correta)
            }else{
                btnI.isEnabled = false
                btnI.background = null
            }
        }
        btnJ.setOnClickListener{
            letra = 'J'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnJ.setBackgroundResource(R.drawable.letra_j_correta)
            }else{
                btnJ.isEnabled = false
                btnJ.background = null
            }
        }
        btnK.setOnClickListener{
            letra = 'K'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnK.setBackgroundResource(R.drawable.letra_k_correta)
            }else{
                btnK.isEnabled = false
                btnK.background = null
            }
        }
        btnL.setOnClickListener{
            letra = 'L'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnL.setBackgroundResource(R.drawable.letra_l_correta)
            }else{
                btnL.isEnabled = false
                btnL.background = null
            }
        }
        btnM.setOnClickListener{
            letra = 'M'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnM.setBackgroundResource(R.drawable.letra_m_correta)
            }else{
                btnM.isEnabled = false
                btnM.background = null
            }
        }
        btnN.setOnClickListener{
            letra = 'N'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnN.setBackgroundResource(R.drawable.letra_n_correta)
            }else{
                btnN.isEnabled = false
                btnN.background = null
            }
        }
        btnO.setOnClickListener{
            letra = 'O'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnO.setBackgroundResource(R.drawable.letra_o_correta)
            }else{
                btnO.isEnabled = false
                btnO.background = null
            }
        }
        btnP.setOnClickListener{
            letra = 'P'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnP.setBackgroundResource(R.drawable.letra_p_correta)
            }else{
                btnP.isEnabled = false
                btnP.background = null
            }
        }
        btnQ.setOnClickListener{
            letra = 'Q'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnQ.setBackgroundResource(R.drawable.letra_q_correta)
            }else{
                btnQ.isEnabled = false
                btnQ.background = null
            }
        }
        btnR.setOnClickListener{
            letra = 'R'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnR.setBackgroundResource(R.drawable.letra_r_correta)
            }else{
                btnR.isEnabled = false
                btnR.background = null
            }
        }
        btnS.setOnClickListener{
            letra = 'S'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnS.setBackgroundResource(R.drawable.letra_s_correta)
            }else{
                btnS.isEnabled = false
                btnS.background = null
            }
        }
        btnT.setOnClickListener{
            letra = 'T'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnT.setBackgroundResource(R.drawable.letra_t_correta)
            }else{
                btnT.isEnabled = false
                btnT.background = null
            }
        }
        btnU.setOnClickListener{
            letra = 'U'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnU.setBackgroundResource(R.drawable.letra_u_correta)
            }else{
                btnU.isEnabled = false
                btnU.background = null
            }
        }
        btnV.setOnClickListener{
            letra = 'V'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnV.setBackgroundResource(R.drawable.letra_v_correta)
            }else{
                btnV.isEnabled = false
                btnV.background = null
            }
        }
        btnW.setOnClickListener{
            letra = 'W'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnW.setBackgroundResource(R.drawable.letra_w_correta)
            }else{
                btnW.isEnabled = false
                btnW.background = null
            }
        }
        btnX.setOnClickListener{
            letra = 'X'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnX.setBackgroundResource(R.drawable.letra_x_correta)
            }else{
                btnX.isEnabled = false
                btnX.background = null
            }
        }
        btnY.setOnClickListener{
            letra = 'Y'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnY.setBackgroundResource(R.drawable.letra_y_correta)
            }else{
                btnY.isEnabled = false
                btnY.background = null
            }
        }
        btnZ.setOnClickListener{
            letra = 'Z'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnZ.setBackgroundResource(R.drawable.letra_z_correta)
            }else{
                btnZ.isEnabled = false
                btnZ.background = null
            }
        }
        btnAtio.setOnClickListener{
            letra = 'Ã'
            validarLetra()
            if(forca.getPalavraSecreta().contains(letra!!)){
                btnAtio.setBackgroundResource(R.drawable.letra_atio_correta)
            }else{
                btnAtio.isEnabled = false
                btnAtio.background = null
            }
        }

        btnVerificar.setOnClickListener {
            caixaInputChute.error = null

            if (forca.tentativasRestantes > 0 && '_' in forca.palavraAdivinhada){

                var chuteDigitado: String? = inputChute.text.toString()
                chuteDigitado = chuteDigitado?.replace("\\s".toRegex(), "")

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

            inputChute.setText("")
            verificar()
        }

    }

    fun validarLetra(){
        if (forca.tentativasRestantes > 0 && '_' in forca.palavraAdivinhada){
            if (letra != null){
                forca.verificarLetra(letra!!)
                vidas.setText("${forca.tentativasRestantes}")
                palavraSecreta.setText(forca.palavraAdivinhada.joinToString("  "))
            }
        }
        verificar()
    }

    fun inicializarElementos(){
        vidas = findViewById(R.id.txt_vidas)
        inputChute = findViewById(R.id.input_chute)
        btnVerificar = findViewById(R.id.btn_verificar)
        palavraSecreta = findViewById(R.id.palavra_secreta)
        palavraSecreta.setText(forca.palavraAdivinhada.joinToString("  "))
        caixaInputChute = findViewById(R.id.caixa_input_chute)
        txtCategoria = findViewById(R.id.txt_categoria)
        btnA= findViewById(R.id.btn_a)
        btnB= findViewById(R.id.btn_b)
        btnC= findViewById(R.id.btn_c)
        btnD= findViewById(R.id.btn_d)
        btnE= findViewById(R.id.btn_e)
        btnF= findViewById(R.id.btn_f)
        btnG= findViewById(R.id.btn_g)
        btnH= findViewById(R.id.btn_h)
        btnI= findViewById(R.id.btn_i)
        btnJ= findViewById(R.id.btn_j)
        btnK= findViewById(R.id.btn_k)
        btnL= findViewById(R.id.btn_l)
        btnM= findViewById(R.id.btn_m)
        btnN= findViewById(R.id.btn_n)
        btnO= findViewById(R.id.btn_o)
        btnP= findViewById(R.id.btn_p)
        btnQ= findViewById(R.id.btn_q)
        btnR= findViewById(R.id.btn_r)
        btnS= findViewById(R.id.btn_s)
        btnT= findViewById(R.id.btn_t)
        btnU= findViewById(R.id.btn_u)
        btnV= findViewById(R.id.btn_v)
        btnW= findViewById(R.id.btn_w)
        btnX= findViewById(R.id.btn_x)
        btnY= findViewById(R.id.btn_y)
        btnZ= findViewById(R.id.btn_z)
        btnAtio= findViewById(R.id.btn_atio)
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