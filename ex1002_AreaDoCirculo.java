package Exs;

import java.util.Scanner;

public class ex1002_AreaDoCirculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double raio = 0, n = 3.14159;
		
		raio = sc.nextDouble();
		
		double area = n * raio * raio;
		
		System.out.printf("A=%.4f" ,area);
		System.out.println();
		
		sc.close();
	}

}
