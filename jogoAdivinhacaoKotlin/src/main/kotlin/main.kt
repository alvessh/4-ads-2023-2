import kotlin.random.Random

fun main() {
    var min = 1
    var max = 100
    var acertou = false
    var tentativas = 0
    val tempoInicio = System.currentTimeMillis()

    println("Pense em um número de 1 à 100.")
    while(!acertou) {
        val numeroAdivinhado = Random.nextInt(min, max + 1)
        println("Eu adivinho: $numeroAdivinhado. Acertei (a), o número correto é maior (+), o número correto é menor (-).")
        val resposta = readLine()
        when(resposta) {
            "a" -> {
                val tempoFim = System.currentTimeMillis()
                val tempoTotal = (tempoFim - tempoInicio) / 1000
                acertou = true
                println("Ahaaaaaa, eu sabia! Adivinhei em $tentativas tentativas e $tempoTotal segundos.")
            }
            "+" -> min = numeroAdivinhado + 1
            "-" -> max = numeroAdivinhado - 1
            else -> println("Opção inválida!")
        }
        tentativas ++
    }
}