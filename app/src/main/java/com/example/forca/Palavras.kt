package com.example.forca

class Palavras private constructor() {
    //lista com todas as categorias e palavras para o jogo
    val lista = listOf(
        Pair("Alimentos", "BANANA"),
        Pair("Alimentos", "LARANJA"),
        Pair("Alimentos", "OVO"),
        Pair("Alimentos", "UVA"),
        Pair("Alimentos", "PERA"),
        Pair("Alimentos", "BATATA"),
        Pair("Alimentos", "ARROZ"),
        Pair("Alimentos", "FRANGO"),
        Pair("Alimentos", "CARNE"),
        Pair("Alimentos", "QUEIJO"),
        Pair("Alimentos", "CHOCOLATE"),
        Pair("Alimentos", "ALFACE"),
        Pair("Alimentos", "MANGA"),
        Pair("Alimentos", "ABACATE"),
        Pair("Alimentos", "ABACAXI"),
        Pair("Alimentos", "SALMÃO"),
        Pair("Alimentos", "MORANGO"),
        Pair("Alimentos", "LIMÃO"),
        Pair("Alimentos", "MACARRÃO"),
        Pair("Alimentos", "FEIJÃO"),
        Pair("Alimentos", "PRESUNTO"),
        Pair("Objetos", "CADEIRA"),
        Pair("Objetos", "MESA"),
        Pair("Objetos", "COMPUTADOR"),
        Pair("Objetos", "MOUSE"),
        Pair("Objetos", "ESTANTE"),
        Pair("Objetos", "CARRO"),
        Pair("Objetos", "BICICLETA"),
        Pair("Objetos", "TELEVISÃO"),
        Pair("Objetos", "CANETA"),
        Pair("Objetos", "COPO"),
        Pair("Objetos", "CHAVE"),
        Pair("Objetos", "LIVRO"),
        Pair("Objetos", "FACA"),
        Pair("Objetos", "GARFO"),
        Pair("Objetos", "BOLSA"),
        Pair("Objetos", "TAPETE"),
        Pair("Objetos", "ESPELHO"),
        Pair("Objetos", "CONTROLE"),
        Pair("Objetos", "CARRO"),
        Pair("Objetos", "COBERTOR"),
        Pair("Objetos", "VASO"),
        Pair("Objetos", "FONE"),
        Pair("Objetos", "ESCOVA"),
        Pair("Ação", "CORRER"),
        Pair("Ação", "ANDAR"),
        Pair("Ação", "COMER"),
        Pair("Ação", "CAMINHAR"),
        Pair("Ação", "CONVERSAR"),
        Pair("Ação", "FAZER"),
        Pair("Ação", "COZINHAR"),
        Pair("Ação", "CANTAR"),
        Pair("Ação", "TOCAR"),
        Pair("Ação", "MERGULHAR"),
        Pair("Ação", "LER"),
        Pair("Ação", "ESCREVER"),
        Pair("Ação", "VIAJAR"),
        Pair("Ação", "FUMAR"),
        Pair("Ação", "AJUDAR"),
        Pair("Ação", "JOGAR"),
        Pair("Cep", "BRASIL"),
        Pair("Cep", "PORTUGAL"),
        Pair("Cep", "INGLATERRA"),
        Pair("Cep", "ESLOVENIA"),
        Pair("Cep", "IRLANDA"),
        Pair("Cep", "JAPÃO"),
        Pair("Cep", "CHINA"),
        Pair("Cep", "ORLANDO"),
        Pair("Cep", "CANADA"),
        Pair("Filme", "TITANIC"),
        Pair("Filme", "MEGAMENTE"),
        Pair("Filme", "INTERESTELAR"),
        Pair("Filme", "ENROLADOS"),
        Pair("Filme", "RATATOUILLE"),
        Pair("Filme", "MADAGASCAR"),
        Pair("Filme", "SHEREK"),
        Pair("Filme", "AVATAR"),
        Pair("Filme", "MATRIX"),
        Pair("Filme", "BATMAN"),
        Pair("Filme", "SCARFACE"),
        Pair("Marca", "GUCCI"),
        Pair("Marca", "LACOSTE"),
        Pair("Marca", "PRADA"),
        Pair("Marca", "BMW"),
        Pair("Marca", "DIOR"),
        Pair("Marca", "VIVARA"),
        Pair("Marca", "NIKE"),
        Pair("Marca", "ADIDAS"),
        Pair("Marca", "ROLEX"),
        Pair("Marca", "MERCEDES"),
        Pair("Marca", "LUPO"),
        Pair("Marca", "AUDI"),
        Pair("Marca", "VANS"),
        Pair("Marca", "DISNEY"),
        Pair("Marca", "INTEL"),
        Pair("Marca", "PEUGEOT"),
        Pair("Esporte", "FUTEBOL"),
        Pair("Esporte", "BASQUETE"),
        Pair("Esporte", "HANDEBOL"),
        Pair("Esporte", "FUTSAL"),
        Pair("Esporte", "GOLFE"),
        Pair("Esporte", "SKATE"),
        Pair("Esporte", "SURFE"),
        Pair("Esporte", "XADREZ"),
        Pair("Esporte", "ESCALADA"),
        Pair("Esporte", "RUGBY"),
        Pair("Esporte", "BOXE"),
        Pair("Animal", "POLVO"),
        Pair("Animal", "MACACO"),
        Pair("Animal", "GIRAFA"),
        Pair("Animal", "LEÃO"),
        Pair("Animal", "PEIXE"),
        Pair("Animal", "CACHORRO"),
        Pair("Animal", "GATO"),
        Pair("Animal", "POMBO"),
        Pair("Animal", "COBRA"),
        Pair("Animal", "BORBOLETA"),
        Pair("Animal", "URSO"),
        Pair("Animal", "ABELHA"),
        Pair("Animal", "GOLFINHO"),
        Pair("Animal", "CANGURU"),
        Pair("Animal", "PATO"),
        Pair("Animal", "ESQUILO"),
        Pair("Animal", "SAPO"),
        Pair("Animal", "GALINHA"),
        Pair("Animal", "VACA"),
        Pair("Animal", "ELEFANTE"),
        Pair("Animal", "CAVALO"),
    )


    private val listaEmbaralhada = lista.toList().shuffled()
    private val listaRepetidos = mutableSetOf<String>()

    private var indiceAtual = 0

    fun getPalavras(): Pair<String, String> {
        // Verifica se todas as palavras já foram escolhidas
        if (listaRepetidos.size == lista.size) {
            // Se sim, limpa o conjunto para recomeçar
            listaRepetidos.clear()
            // Embaralha a lista novamente
            indiceAtual = 0
            listaEmbaralhada.shuffled()
        }

        // Obtém a próxima palavra e categoria
        val palavraEcategoriaRandom = listaEmbaralhada[indiceAtual]

        // Incrementa o índice para a próxima chamada
        indiceAtual++

        // Adiciona a palavra ao conjunto de palavras já escolhidas
        listaRepetidos.add(palavraEcategoriaRandom.second)

        // Retorna a palavra e a categoria
        return palavraEcategoriaRandom
    }

    companion object {
        // Volatile garante que as alterações feitas por uma thread sejam visíveis para outras threads
        @Volatile
        private var instance: Palavras? = null

        // Método estático para obter a instância única da classe
        fun getInstance(): Palavras =
            // Elvis operator (?:) verifica se 'instance' é nulo
            instance ?: synchronized(this) {
                // Se 'instance' ainda for nulo, cria uma nova instância de Palavras
                instance ?: Palavras().also { instance = it }
            }
    }

}