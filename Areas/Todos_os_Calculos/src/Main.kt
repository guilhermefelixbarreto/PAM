import kotlin.math.sqrt
import kotlin.math.PI

// Triângulos
fun Equilatero(Lado: Double): Double{
    return ((Lado * Lado * sqrt(3.0))/4)
}

fun Isosceles(Base: Double, Altura: Double): Double {
    return (Base * Altura)/2
}

fun Escaleno(Base: Double, Altura: Double): Double {
    return (Base * Altura)/2
}

// Circuferência
fun CalculoCircuferencia(raio: Double): Double{
    return (PI * raio * raio)
}

// Área Losango
fun CalculoLosango(DiagonalMaior: Double, DiagonalMenor: Double): Double{
    return (DiagonalMaior * DiagonalMenor)/2
}

// Área Retângulo
fun CalcularRetangulo(base: Double, altura: Double): Double {
    return (base * altura)
}

// Área Trapézio
fun CalculoTrapezio(BaseMaior: Double, BaseMenor: Double, altura: Double): Double{
    return ((BaseMaior+BaseMenor) * altura)/2
}

//Fim das Funções

fun main() {
    println("O que você deseja calcular?")

    println("1 - Triângulo Equilátero")
    println("2 - Triângulo Isósceles")
    println("3 - Triângulo Escaleno")
    println("4 - Circuferência")
    println("5 - Losango")
    println("6 - Retângulo")
    println("7 - Trapézio")

    println("Opção:")
    val opcao = readLine()?.toIntOrNull()

    if (opcao != null){

        when (opcao) {

            1 -> {
                println("Informe o valor do lado do triângulo Equilátero:")
                val Lado = readLine()?.toDoubleOrNull()

                if (Lado != null) {
                    val area = Equilatero(Lado)
                    println("A Área do Equilátero com o valor do lado:$Lado é: $area")
                } else {
                    println("Valores informados Inválidos.")
                }
            }

            2 -> {
                println("Informe o valor da base do triângulo Isósceles:")
                val Base = readLine()?.toDoubleOrNull()

                println("Informe o valor da Altura do Triângulo:")
                val Altura = readLine()?.toDoubleOrNull()

                if (Base != null && Altura != null) {
                    val area = Isosceles(Base, Altura)
                    println("A Área do Isósceles com o valor da base:$Base e o valor da altura:$Altura é: $area")
                } else {
                    println("Valores informados Inválidos.")
                }
            }

            3 -> {
                println("Informe o valor da base do triângulo Escaleno:")
                val Base = readLine()?.toDoubleOrNull()

                println("Informe o valor da Altura do Triângulo:")
                val Altura = readLine()?.toDoubleOrNull()

                if (Base != null && Altura != null) {
                    val area = Escaleno(Base, Altura)
                    println("A Área do Isósceles com o valor da base:$Base e o valor da altura:$Altura é: $area")
                } else {
                    println("Valores informados Inválidos.")
                }
            }

            4 -> {
                println("Informe o valor do Raio da circuferência:")
                val raio = readLine()?.toDoubleOrNull()

                if (raio != null){
                    val area = CalculoCircuferencia(raio)
                    println("A Área do circulo com o raio:$raio informado é: $area")
                } else {
                    println("Valores informados inválidos.")
                }
            }

            5 -> {
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

            6 -> {
                println("Digite o valor da Base do retãngulo:")
                val base = readLine()?.toDoubleOrNull()

                println("Digite o vlaor da Altura do retângulo: ")
                val altura = readLine()?.toDoubleOrNull()

                if (base != null && altura != null){
                    val area = CalcularRetangulo(base, altura)
                    println("A Área desse retângulo com os valores da base:$base e da altura:$altura é: $area")
                } else {
                    println("Valores digitados inválidos.")
                }
            }

            7 -> {
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
                    println("Valores informados Inválidos.")
                }
            }

            else -> {
                println("Opção inválida.")
            }
        }
    } else{
        println("Informações inválidas.")
    }
}
