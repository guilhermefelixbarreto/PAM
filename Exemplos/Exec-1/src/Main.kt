//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
        // Tipos Númericos inteiros
        val numero1: Byte = 127
        val numero2: Short = 36284.toShort()
        val numero3: Int = 2_147_483_647
        val numero4: Long = 9_223_372_036_325_943_432

        // Tipos Númericos Reais
        val numero5: Float = 3.54F
        val numero6: Double = 3.14

        // Tipo de Caractere
        val char: Char = '?' // Outros Exemplos

        //Tipo Boolean
        val boolean: Boolean = true

        //Prints
        println(listOf(numero1,numero2,numero3,numero4,numero5,numero6, char, boolean))
        println(2 is Int)
        println(2147483648 is Long)
        println(1.0 is Double)

        //Tudo é objeto
        println(10.dec())
}