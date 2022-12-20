package Exs;

import java.util.Scanner;

public class ex1003_SomaSimples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		int soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
