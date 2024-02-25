import kotlin.math.sqrt

fun Equilatero(Lado: Double): Double{
    return ((Lado * Lado * sqrt(3.0))/4)
}

fun Isosceles(Base: Double, Altura: Double): Double {
    return (Base * Altura)/2
}

fun Escaleno(Base: Double, Altura: Double): Double {
    return (Base * Altura)/2
}

fun main() {
    println("Selecione o fórmula do triângulo que você deseja calcular:")

    println("1 - Equilátero")
    println("2 - Isósceles")
    println("3 - Escaleno")

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

        else -> {
            println("Opção inválida.")
            }
        }
    } else{
        println("Informações inválidas.")
    }
}