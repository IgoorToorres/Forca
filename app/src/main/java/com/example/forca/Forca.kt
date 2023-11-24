package com.example.forca

import android.text.Editable
import java.util.Scanner

class Forca {
    //Instância da classe Palavras para obter a lista de palavras

    val palavras = Palavras.getInstance()


    // Par contendo a categoria e a palavra secreta escolhida aleatoriamente
    private var palavraCategoriaPair = palavras.getPalavras()

    // Palavra secreta a ser adivinhada pelo jogador
    private var palavraSecreta: String = palavraCategoriaPair.second

    // Categoria da palavra secreta
    private var categoria: String = palavraCategoriaPair.first

    // Array de caracteres representando a palavra adivinhada, inicializado com '_'
    val palavraAdivinhada = CharArray(palavraSecreta.length) {'_'}

    // Número de tentativas restantes para o jogador
    var tentativasRestantes: Int = 8


    // Método para verificar se uma letra está presente na palavra secreta
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

    // Método para verificar se um chute corresponde à palavra secreta
    fun verificarChute(chute: String){
        if(chute.uppercase() == palavraSecreta){
            for (i in palavraSecreta.indices){
                palavraAdivinhada[i] = palavraSecreta[i]
            }
        }else{
            tentativasRestantes--
        }
    }

    // Método para obter a palavra secreta
    fun getPalavraSecreta():String{
        return this.palavraSecreta
    }

    // Método para obter a categoria da palavra
    fun getCategoria():String{
        return categoria
    }

}