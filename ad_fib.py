import time

def generate_fibonacci_sequence(limit):
    sequence = [0, 1]
    while sequence[-1] < limit:
        next_number = sequence[-1] + sequence[-2]
        sequence.append(next_number)
    sequence.pop(0)  # Remova o primeiro elemento (0) para evitar repetições
    return sequence

def jogo_de_adivinhacao_fibonacci():
    print("Bem-vindo ao Jogo de Adivinhação!")
    print("Pense em um número entre 1 e 100.")
    
    numero_minimo = 1
    numero_maximo = 100
    
    inicio = time.time()  # Captura o tempo de início
    tentativas = 0
    
    # Gere a sequência de Fibonacci limitada ao intervalo [1, 100]
    fibonacci_sequence = generate_fibonacci_sequence(numero_maximo)
    
    while True:
        # Verifique se a sequência de Fibonacci esgotou todas as tentativas possíveis
        if tentativas >= len(fibonacci_sequence):
            print("Você trapaceou! Não é possível adivinhar o número.")
            break
        
        # Calcula a suposição usando a sequência de Fibonacci
        suposicao = numero_minimo + fibonacci_sequence[tentativas]
        print(f"Eu acho que o número é: {suposicao}")
        
        # O usuário fornece uma dica
        dica = input("O seu número é muito alto (H), muito baixo (B) ou correto (C)? ").upper()
        
        tentativas += 1
        
        if dica == 'C':
            fim = time.time()  # Captura o tempo de fim
            tempo_decorrido = fim - inicio  # Calcula o tempo decorrido
            print(f"Eu adivinhei em {tentativas} tentativas e {tempo_decorrido:.2f} segundos! Obrigado por jogar.")
            break
        elif dica == 'H':
            numero_maximo = suposicao - 1
        elif dica == 'B':
            numero_minimo = suposicao + 1
        else:
            print("Desculpe, não entendi a sua dica. Por favor, responda com 'H', 'B' ou 'C'.")
        
        print()  # Linha vazia para melhorar a legibilidade

# Iniciar o jogo otimizado com busca de Fibonacci
jogo_de_adivinhacao_fibonacci()
