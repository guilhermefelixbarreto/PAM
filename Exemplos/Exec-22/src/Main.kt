//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("O menor valor é ${min(3, 4)}")
}

fun min (a: Int, b: Int): Int{
    return if (a < b) a else b
}