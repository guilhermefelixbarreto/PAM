fun CalculoTrapezio(BaseMaior: Double, BaseMenor: Double, altura: Double): Double{
    return ((BaseMaior+BaseMenor) * altura)/2
}

fun main() {

    println("Informe o valor da Base Maior:")
    val BaseMaior = readLine()?.toDoubleOrNull()

    println("Informe o valor da Base Menor:")
    val BaseMenor = readLine()?.toDoubleOrNull()

    println("Informe a altura do Trapézio:")
    val altura = readLine()?.toDoubleOrNull()

    if (BaseMaior != null && BaseMenor != null && altura != null){
        var area = CalculoTrapezio(BaseMaior, BaseMenor, altura)
        println("Á Área do trapézio com o valor da Base maior:$BaseMaior, Base Menor:$BaseMenor e Altura:$altura é: $area")
    } else {
        println("Valor informados Inválidos.")
    }

}