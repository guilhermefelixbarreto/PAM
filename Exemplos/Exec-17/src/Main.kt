//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val Alunos = arrayListOf("André", "Carla", "Marcos")
    for ((indice, aluno) in Alunos.withIndex()) {
        println("$indice - $aluno \n")
    }
}