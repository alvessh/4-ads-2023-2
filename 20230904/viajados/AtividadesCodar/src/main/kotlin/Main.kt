fun soma(num1:Int, num2:Int):Int {
    return num1 + num2
}
fun main() {
    println("Digite um número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    println("Digite um segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    println(soma(num1,num2))
}