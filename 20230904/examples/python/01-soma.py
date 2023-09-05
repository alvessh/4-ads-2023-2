#/usr/bin/python3
#Soma de Números
#Escreva um algoritmo que recebe dois números e retorna a soma deles.

class SomaNumero:

    def __init__(self, n1, n2):
        self.n1 = n1
        self.n2 = n2

    def somar(self):
        return self.n1 + self.n2
    
    def getN1(self):
        return self.n1
    
    def getN2(self):
        return self.n2
    

if __name__ == "__main__":
    somaNumero = SomaNumeros(1000, 2055)
    resultado = somaNumero.somar()

    print(f"A soma de {somaNumero.getN1()} e {somaNumero.getN2()} é igual a {resultado}")