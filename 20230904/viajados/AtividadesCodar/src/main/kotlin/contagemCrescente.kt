fun main() {

    println("Digite um número para que eu conte de 1 até o número escolhido: ")
    val num = readLine()?.toIntOrNull() ?: 0

    for(i in 1..num) {
        print("$i - ")
    }
}