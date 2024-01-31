// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    // Criação de alguns objetos para teste
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 90)

    val formacaoKotlin = Formacao("Formação Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    // Verificação dos inscritos na formação
    println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos.map { it.nome }}")
}