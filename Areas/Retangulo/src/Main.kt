//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun CalcularRetangulo(base: Double, altura: Double): Double {
   return (base * altura)
}

fun main() {
   println("Digite o valor da Base do retãngulo")
   val base = readLine()?.toDoubleOrNull()

   println("Digite o vlaor da Altura do retângulo ")
   val altura = readLine()?.toDoubleOrNull()

  if (base != null && altura != null){
     val area = CalcularRetangulo(base, altura)
     println("A Área desse retângulo com os valores da base:$base e da altura:$altura é: $area")
  } else {
     println("Valores digitados inválidos.")
  }

}