package com.example.forca

import android.text.Editable
import java.util.Scanner

class Forca {

    val palavras = Palavras()
    private val palavraCategoriaPair = palavras.lista.toList().shuffled().first()
    private val palavraSecreta: String = palavraCategoriaPair.second
    private val categoria: String = palavraCategoriaPair.first

    val palavraAdivinhada = CharArray(palavraSecreta.length) {'_'}
    var tentativasRestantes: Int = 7


    fun verificarLetra(letra: Char){
        if (palavraSecreta.contains(letra.uppercaseChar())){
            for (i in palavraSecreta.indices){
                if (palavraSecreta[i] == letra.uppercaseChar()){
                    palavraAdivinhada[i] = letra.uppercaseChar()
                }
            }
        }else{
            tentativasRestantes--
        }
    }

    fun verificarChute(chute: String){
        if(chute.uppercase() == palavraSecreta){
            for (i in palavraSecreta.indices){
                palavraAdivinhada[i] = palavraSecreta[i]
            }
        }else{
            tentativasRestantes--
        }
    }

    fun getPalavraSecreta():String{
        return this.palavraSecreta
    }

    fun getCategoria():String{
        return categoria
        System.out.println("teste")
    }

}