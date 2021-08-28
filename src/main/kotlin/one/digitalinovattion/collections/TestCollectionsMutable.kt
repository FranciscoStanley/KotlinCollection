package one.digitalinovattion.collections

fun main(){

    //Declarando as variavéis

    val francisco = FuncionariosContratos("Francisco Stanley", 3600.0, "CLT")
    val sabrina = FuncionariosContratos("Sabrina de Sousa", 4600.0, "CLT")
    val albuquerque = FuncionariosContratos("Rodrigues Albuquerque", 3600.0, "PJ")

    val funcionarios = mutableListOf(francisco, sabrina)

    println("-----------LIST-------------")
    //Processamento e saida de dados iterando com forEach.
    funcionarios.forEach { println(it) }

    //Add albuquerque e fazendo a saida de dados iterando com forEach.
    println("--------LIST & ADD----------")
    funcionarios.add(albuquerque)
    funcionarios.forEach { println(it) }

    //removendo albuquerque e fazendo a saida de dados iterando com forEach.
    println("--------LIST & REMOVE--------")
    funcionarios.remove(albuquerque)
    funcionarios.forEach { println(it) }

    //Declarando um set.
    println("------------SET--------------")
    val funcionarioSet = mutableSetOf(albuquerque)
    funcionarioSet.forEach { println(it) }

    println("----------SET & ADD----------")
    //Add Sabrina no funcionarioSet
    funcionarioSet.add(sabrina)
    funcionarioSet.forEach { println(it) }

    println("--------SET & REMOVE--------")
    //Set sabrina no funcionarioSet
    funcionarioSet.remove(sabrina)
    funcionarioSet.forEach { println(it) }
}