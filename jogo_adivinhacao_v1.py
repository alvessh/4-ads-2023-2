import random
import time

def jogo_de_adivinhacao():
    print("Bem-vindo ao Jogo de Adivinhação!")
    print("Pense em um número entre 1 e 100.")
    
    numero_minimo = 1
    numero_maximo = 100
    
    inicio = time.time()  # Captura o tempo de início
    
    while True:
        # O computador faz uma suposição
        suposicao = random.randint(numero_minimo, numero_maximo)
        print(f"Eu acho que o número é: {suposicao}")
        
        # O usuário fornece uma dica
        dica = input("O seu número é muito alto (H), muito baixo (B) ou correto (C)? ").upper()
        
        if dica == 'C':
            fim = time.time()  # Captura o tempo de fim
            tempo_decorrido = fim - inicio  # Calcula o tempo decorrido
            print(f"Eu sabia que conseguiria adivinhar em {tempo_decorrido:.2f} segundos! Obrigado por jogar.")
            break
        elif dica == 'H':
            numero_maximo = suposicao - 1
        elif dica == 'B':
            numero_minimo = suposicao + 1
        else:
            print("Desculpe, não entendi a sua dica. Por favor, responda com 'H', 'B' ou 'C'.")
        
        print()  # Linha vazia para melhorar a legibilidade

# Iniciar o jogo
jogo_de_adivinhacao()