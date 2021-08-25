package one.digitalinovattion.collections

fun main(){
    //Declarando as variavéis usando Array de Strings
    val nomes = Array(5){""}

    //Entrada de dados
    nomes[0] = "Francisco"
    nomes[1] = "Sabrina"
    nomes[2] = "Sousa"
    nomes[3] = "Albuquerque"
    nomes[4] = "Stanley"

    //Processamento/Saída de dados.
    for (nome in nomes){
        println(nome)
    }

    println("------------------------------")
    // Processamento/Saída de dados.
    nomes.forEach {
        println(it)
    }

    println("------------------------------")
    // Processamento/Saída de dados ordenado
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("------------------------------")
    // Processamento/Saída de dados.
    val nomes2 = arrayOf("Francisco", "Sabrina", "Sousa", "Albuquerque", "Stanley")
        nomes2.forEach {
            println(it)
        }
}