package one.digitalinovattion.collections

fun main(){

    //Declarando varavéis/Instanciando 3x objetos.

    val francisco = Funcionario("Francisco Stanley", 3600.0)
    val sabrina = Funcionario("Sabrina de Sousa", 4600.0)
    val albuquerque = Funcionario("Rodrigues Albuquerque", 3600.0)

    //Declarando variavéis/Atribuindo a lista.
    val funcionarios = listOf(francisco, sabrina, albuquerque)

    //Processamento/Saída de dados/Iterando a lista.

    funcionarios.forEach {
        println(it)
    }

    //Processamento/Saída de dados usado para buscar salario de funcionario especifico.
    println("-------------------------------------------")
    println(funcionarios.find { it.nome == "Sabrina de Sousa" })

    //Criando um encadeamento para realizar operações sobre a collection.
    println("-------------------------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }


}
//Declarando um data class de funcionario.
data class Funcionario(

    val nome:String,
    val salario:Double

){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
    """.trimIndent()
}