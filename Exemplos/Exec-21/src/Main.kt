//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
inline fun <T> execultarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no Método $nomeFuncao")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun main (){
    val resultado = execultarComLog("Somar"){
        somar(4,5)
    }
    println(resultado)
}