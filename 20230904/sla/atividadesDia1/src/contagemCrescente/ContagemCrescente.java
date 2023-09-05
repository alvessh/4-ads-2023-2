//by: Lucas Gabriel
package contagemCrescente;

import java.util.Scanner;

public class ContagemCrescente {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("insira um numero: ");
		Integer n = scan.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println(i);
			scan.close();
		}
	}
}
