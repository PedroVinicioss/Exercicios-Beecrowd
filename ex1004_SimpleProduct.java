package Exs;

import java.util.Scanner;

public class ex1004_SimpleProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		int product = A * B;
		
		System.out.println("PROD = " + product);
		
		sc.close();
	}

}
