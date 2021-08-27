package one.digitalinovattion.collections

fun main(){

    //Delcarando variavéis.
    val salarios = doubleArrayOf(2300.0, 3100.0, 5200.0)

    //Processamento/Saída de dados.
    for(salario in salarios){
        println(salario)//Saída de dados
    }

    //Saída de dados.
    println("---------------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    //Declarando variável e filtrando os sálarios.
    val salariosFilterMaior3000 = salarios.filter { it > 3000.0 }

    //Saída de dados.
    println("----------------------------------")
    salariosFilterMaior3000.forEach {
        println(it)

    //Usando count para contar no range de 2k até 5k.
    println("----------------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    //Usando o find para retorna o valor que seja == e null para oque não estiver dentro do que pedi.
    println("----------------------------------")
    println(salarios.find { it == 2300.0 })
    println(salarios.find { it == 1300.0 })

    //Usando o predicados de teste any para retorna se verdadeiro o valor e false se estiver fora do predicado.
    println("----------------------------------")
    println(salarios.any { it == 2300.0 })
    println(salarios.any { it == 1300.0 })
    }


}