package one.digitalinovattion.collections

fun main(){

    //Declaração de Variavéis
    val salarios = DoubleArray(3)

    //Entrada de dados
    salarios[0] = 1500.0
    salarios[1] = 2400.0
    salarios[2] = 5200.0

    //Processamento/Saída de dados
    salarios.forEach {
        println(it)
    }

    println("----------------------------------------------")
    //Declaração de dados para fazer alteração para aumentar o sálario!!! Usando expressão lambda forEachIndexed.
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    //Processamento/Saída de dados
    salarios.forEach {
        println(it)
    }

    println("------------------------------------------------")
    //Declarando variavél salarios2
    val salarios2 = doubleArrayOf(1500.0, 2400.0, 5200.0)

    //Ordenando
    salarios2.sort()

    //Processamento/Saída de dados.
    salarios2.forEach {
        println(it)
    }
}