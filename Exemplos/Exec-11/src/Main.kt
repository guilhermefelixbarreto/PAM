//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nota2 = 9
    // Utilzando Operador Range
    if(nota2 in 9 .. 10){
        println("Fantástico")
    } else if(nota2 in 7 .. 8)
    {
        println("Parabéns")
    } else if(nota2 in 4 .. 6)
    {
        println("Tem como recuperar")
    } else if(nota2 in 0 .. 3)
    {
        println("Te vejo no próximo ano")
    } else
    {
        println("Nota inválida")
    }
}