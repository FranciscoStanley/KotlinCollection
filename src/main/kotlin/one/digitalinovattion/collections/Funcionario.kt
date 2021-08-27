package one.digitalinovattion.collections

data class Funcionario (

    val nome:String,
    val salario:Double,
    val TipoContrato:String,
){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
        Tipo de contrato: $TipoContrato
    """.trimIndent()
}
