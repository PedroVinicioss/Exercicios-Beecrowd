package Exs;

import java.util.Scanner;

public class ex1001_ExtremamenteBasico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = 0, B = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		int X = A + B;
		
		System.out.println("X = " + X);
		
		sc.close();
	}

}
