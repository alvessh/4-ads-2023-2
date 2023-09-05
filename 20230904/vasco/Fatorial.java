package aula1;

import java.util.Scanner;

public class Fatorial {
	
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Coloque o primeiro número: ");
        double x = scanner.nextInt();
        double f = x;

		while (x > 1){

		  f = f *(x-1);
		  x--;
		  System.out.println(f);
	
	
}
}}