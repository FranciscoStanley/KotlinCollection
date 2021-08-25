package one.digitalinovattion.collections

fun main() {
    //Declarando variavél.
    val values = IntArray(5)
    
    //Declarando a entrada de dados.
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //Processamento/Saída dos dados
    for(valor in values) {
        println(valor)
    }

    //Processamento/Saída dos dados usando forEach.
    println("---------------------------------------------------------")
    values.forEach {
        println(it)
    }

    //Processamento/Saída dos dados, os indices!
    println("---------------------------------------------------------")
    for(index in values.indices){
        println(values[index])
    }

    //Processamento/Saída dos dados com sort! Fazendo a ordenação do menor para o >.
    println("---------------------------------------------------------")
    values.sort()
    for(valor in values){
       println(valor)
    }

}
