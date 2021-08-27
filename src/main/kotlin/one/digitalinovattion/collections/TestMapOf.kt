package one.digitalinovattion.collections

fun main(){

    //Declarando as variavéis
    val pair: Pair<String, Double> = Pair("Albuquerque", 3600.0)
    val map1 = mapOf(pair)

    //Processamento e saída de dados usando forEach para iterar.
    map1.forEach { (k, v) -> println("Chave: $k - valor: $v") }

    println("----------------------------------")

    //Declarando as variavéis para o map2.
    val map2 = mapOf(
        "Albuquerque" to 3600.0,
        "Sabrina" to 4600.0
    )

    //Processamento e saída de dados usando forEach para iterar.
    map2.forEach { (k, v) -> println("Chave: $k - valor: $v") }


}

//O map é uma coleção de chaves e seus valores.