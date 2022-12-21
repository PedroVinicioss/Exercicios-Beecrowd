package Exs;

import java.util.Scanner;

public class ex1012_Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f", ((a * c)/2));
		System.out.printf("\nCIRCULO: %.3f", (pi * Math.pow(c, 2)));
		System.out.printf("\nTRAPEZIO: %.3f", (((a + b) * c) / 2));
		System.out.printf("\nQUADRADO: %.3f", Math.pow(b, 2));
		System.out.printf("\nRETANGULO: %.3f", (a * b));
		
		System.out.println();
		
		sc.close();
	}

}
