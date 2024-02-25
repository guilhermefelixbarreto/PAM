import java.util.Calendar

fun CalculoLosango(DiagonalMaior: Double, DiagonalMenor: Double): Double{
    return (DiagonalMaior * DiagonalMenor)/2
}

fun main() {
    println("Informe o valor do lado da Diagonal maior:")
    val DiagonalMaior = readLine()?.toDoubleOrNull()

    println("informe o valor do lado da Diagonal menor:")
    val DiagonalMenor = readLine()?.toDoubleOrNull()

    if (DiagonalMaior != null && DiagonalMenor != null){
        val area = CalculoLosango(DiagonalMaior, DiagonalMenor)
        println("A Área do losango com a Diagonal Maior:$DiagonalMaior e a Diagonal Menor:$DiagonalMenor informados é: $area")
    }else {
        println("Valores digitados inválidos.")
    }

}