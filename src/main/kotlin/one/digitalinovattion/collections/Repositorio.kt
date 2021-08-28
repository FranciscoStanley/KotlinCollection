package one.digitalinovattion.collections

class Repositorio <T> {

    //Declarando uma variavél private que receb um mutablemapof.
    private val map = mutableMapOf<String, T>()

    //Declarando uma função chamada create que está recebendo um id e um valor.
    fun create(id:String, value: T){

        map[id] = value

    }

    //Declarando uma função chamada remove que está recebendo um id e um valor.
    fun remove(id:String,) = map.remove(id)


    //Declarando uma função chamada de findById. Onde recebe um map com valor id.
    fun findById(id:String) = map[id]

    fun findAll() = map.values
}