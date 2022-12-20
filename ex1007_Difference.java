package Exs;

import java.util.Scanner;

public class ex1007_Difference {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int difference = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + difference);
		
		sc.close();
	}

}
