package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Daniel"
    var cpf: String = "123.123.123.11"
    private set
}

fun main(){
    val daniel = Pessoa()

    println(daniel)
    println(daniel.name)
    println(daniel.cpf)
}