package one.digitalinovattion.collections

fun main(){

    //Declarando varavéis/Instanciando 3x objetos.

    val francisco = Funcionarios3("Francisco Stanley", 3600.0, "CLT")
    val sabrina = Funcionarios3("Sabrina de Sousa", 4600.0, "CLT")
    val albuquerque = Funcionarios3("Rodrigues Albuquerque", 3600.0, "PJ")

    //Declarando as variavéis do conjunto 1 e 2.
    val funcionarios1 = setOf(francisco, albuquerque)
    val funcionarios2 = setOf(sabrina)

    //Declarando variavél para fazer união do 1 e 2 para pegar o resultado da uniao e em seguida usando forEach.

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    //Declarando variavél para fazer subtração do 3 e 2 para pegar o resultado em seguida usando forEach.
    println("------------------------------------")
    val funcionarios3 = setOf(francisco, sabrina, albuquerque)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("------------------------------------")
    //Declarando variavél para fazer interceção do 3 e 2 para pegar o resultado em seguida usando forEach.
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}

//Declarando um data class de funcionario.
data class Funcionarios3(

    val nome:String,
    val salario:Double,
    val TipoContrato:String

){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
    """.trimIndent()
}