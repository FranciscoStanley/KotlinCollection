package one.digitalinovattion.collections

fun main(){

    //Declarando as variavéis

    val francisco = Funcionario("Francisco Stanley", 3600.0)
    val sabrina = Funcionario("Sabrina de Sousa", 4600.0)
    val albuquerque = Funcionario("Rodrigues Albuquerque", 3600.0)

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(francisco.nome, francisco)
    repositorio.create(sabrina.nome, sabrina)
    repositorio.create(albuquerque.nome, albuquerque)

    println(repositorio.findById(francisco.nome))

    println("-------------------------")
    repositorio.findAll().forEach { println(it) }

    //Removendo
    println("----------REMOVE-------------")
    repositorio.remove(sabrina.nome)
    repositorio.findAll().forEach { println(it) }
}