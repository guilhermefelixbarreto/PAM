import java.awt.font.NumericShaper

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numero1: Int = 2
    val numero2: Int = 3
    val MaiorValor = if (numero1 > numero2){
        println("Processando...")
        numero1
    } else {
        println("Processando...")
        numero2
    }
    println("O maior valor é: $MaiorValor")
}