import kotlin.math.PI

fun CalculoCircuferencia(raio: Double): Double{
    return (PI * raio * raio)
}

fun main() {
    println("Informe o valor do Raio da circuferência:")
    val raio = readLine()?.toDoubleOrNull()

    if (raio != null){
        val area = CalculoCircuferencia(raio)
        println("A Área do circulo com o raio:$raio informado é: $area")
    } else {
        println("Valores informados inválidos.")
    }

}