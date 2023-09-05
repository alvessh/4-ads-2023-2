fun main() {
    println("Digite um número para que eu conte apenas os números pares de 0 até o número escolhido: ")
    val num = readLine()?.toIntOrNull() ?: 0

    for(i in 0..num) {
        if(i % 2 == 0) {
            print("$i - ")
        }
    }
}