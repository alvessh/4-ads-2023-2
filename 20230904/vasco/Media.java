package aula1;
import java.util.Scanner;

public class Média {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double resultado;
        
        double resultado2;
        
        System.out.println("Coloque o primeiro número: ");
        int number1 = scanner.nextInt();

        System.out.println("Coloque o segundo número: ");
        int number2 = scanner.nextInt();
        
        System.out.println("Coloque o segundo terceiro: ");
        int number3 = scanner.nextInt();
        
        resultado = number1 + number2 + number3;
        
        resultado2 = resultado / 3;

        System.out.println("A média é " + resultado2);
    }
}
