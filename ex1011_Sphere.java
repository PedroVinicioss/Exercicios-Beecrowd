package Exs;

import java.util.Scanner;

public class ex1011_Sphere {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double r = 0, pi = 3.14159;

		r = sc.nextDouble();
		
		double volume = (4.0/3) * pi * Math.pow(r,3);
		
		System.out.printf("VOLUME = %.3f", volume);
		System.out.println();
		
		sc.close();
	}

}
