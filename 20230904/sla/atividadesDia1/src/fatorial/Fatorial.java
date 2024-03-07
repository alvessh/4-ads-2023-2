package fatorial;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Integer fatorial = 1;

		System.out.println("digite um numero");

		Integer n = scan.nextInt();

		for (int i = 1; i <=n ; i++) {
			fatorial *= i;
		}
		System.out.println(n + "!" + " = " + fatorial);
		scan.close();
	}
}
