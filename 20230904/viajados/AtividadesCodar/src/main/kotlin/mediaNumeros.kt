fun main() {
    println("Digite um número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    println("Digite um segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    println("Digite um terceiro número: ")
    val num3 = readLine()?.toIntOrNull() ?: 0

    val media = (num1 + num2 + num3) / 3
    println("A media de $num1, $num2 e $num3 é: $media")
}