package one.digitalinovattion.collections

fun main(){

    val francisco = FuncionariosContratos("Francisco Stanley", 3600.0, "CLT")
    val sabrina = FuncionariosContratos("Sabrina de Sousa", 4600.0, "CLT")
    val albuquerque = FuncionariosContratos("Rodrigues Albuquerque", 3600.0, "PJ")

    //Declarando variavéis/Atribuindo a lista.
    val funcionarios = listOf(francisco, sabrina, albuquerque)


    //Criando um encadeamento para realizar operações sobre a collection.
    println("-------------------------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
    println("-------------------------------------------")
}
//Declarando um data class de funcionario.
data class FuncionariosContratos(

    val nome:String,
    val salario:Double,
    val tipoContratacao:String

){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
        Tipo de contratação: $tipoContratacao
    """.trimIndent()
}