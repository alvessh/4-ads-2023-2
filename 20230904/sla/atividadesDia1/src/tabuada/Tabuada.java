package tabuada;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um numero");
		Integer n = scan.nextInt();
		
		
		for (int i=0; i<=10; i++) {
		Integer mult = n*i;
		System.out.println(n + " X " + i +" = "+mult);
		}
		scan.close();
	}
}
