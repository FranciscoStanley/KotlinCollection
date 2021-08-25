package one.digitalinovattion.collections

fun main(){

    //Declarando a variavél values que está recebendo a atribuição de um array.
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    //Processamento/Saída de dados usando forEach.
    values.forEach {
        println(it)
    }

    //Processamento/Saída de dados usando sort para ordenar do menor para >, uso do forEach.
    println("--------------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }

}