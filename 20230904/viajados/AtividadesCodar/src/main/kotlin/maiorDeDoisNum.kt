fun maiorNum(num1: Int, num2: Int) {
    if (num1 > num2) println("O maior número é: $num1") else println("O maior número é: $num2")
}

fun main() {
    println("Digite um número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    println("Digite um segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    maiorNum(num1, num2)
}