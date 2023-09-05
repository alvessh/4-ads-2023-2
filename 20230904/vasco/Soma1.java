package aula1;

import java.util.Scanner;

public class Soma1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque o primeiro número: ");
        int number1 = scanner.nextInt();

        System.out.println("Coloque o segundo número: ");
        int number2 = scanner.nextInt();

        int resultado = number1 + number2;

        System.out.println("A soma de " + number1 + " mais " + number2 + " é: " + resultado);
    }
}
