package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe:  Pessoa. Nome: ${nome} e Idade: ${idade}"
    }
}


fun main() {
    var felipe = Pessoa("Felipe", 20)

    println(felipe)
}