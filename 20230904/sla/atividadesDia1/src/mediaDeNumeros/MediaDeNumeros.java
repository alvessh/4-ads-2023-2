package mediaDeNumeros;

import java.util.Scanner;

public class MediaDeNumeros {

	public static void main(String[] args) {
		Double n1;
		Double n2;
		Double n3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("digite os numeros");
		System.out.println("primeiro numero: ");
		n1 = scan.nextDouble();
		System.out.println("segundo numero: ");
		n2 = scan.nextDouble();
		System.out.println("terceiro numero: ");
		n3 = scan.nextDouble();
		
		Double soma = n1+n2+n3;
		Double media = soma/3;
		System.out.println("a media entre os numeros e: " + media);
		scan.close();
	}
}
