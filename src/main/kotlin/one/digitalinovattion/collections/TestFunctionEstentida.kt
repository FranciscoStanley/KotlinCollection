package one.digitalinovattion.collections

fun main() {

    //Declaração das variavéis.
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "3000".toBigDecimal(),
        "5000".toBigDecimal()
    )

    //Saída de dados da somatória.
    println("-----SOMATÓRIA-----")
    println(salarios.somatoria())

    //Saída de dados da média.
    println("-------MÉDIA-------")
    println(salarios.media())

}