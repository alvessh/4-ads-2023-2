package aula1;

import java.util.Scanner;

public class NumPrimos {

    public static void main(String[] args) {

        int N;
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um Número: ");
        N = tec.nextInt();
        while (N <= 0) {
            System.out.print("Digite um Número: ");
            N = tec.nextInt();
        }

        if (N == 1 || N == 2) {
            System.out.println("O número é primo");
        } else {
            if (isNotPrimo(N)) {
                System.out.println("O número NÃO é primo");
            } else {
                System.out.println("O número é primo");
            }
        }
        tec.close();
    }

    public static boolean isNotPrimo(int x) {
        int y, aux;
        aux = (int) (x / 2);

        for (y = 2; y <= aux; y++) {
            if (x % y == 0) {
                return true;
            }
        }
        return false;
    }
}
