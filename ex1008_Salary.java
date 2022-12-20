package Exs;

import java.util.Scanner;

public class ex1008_Salary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0, hours = 0;
		double value = 0;
		
		n = sc.nextInt();
		hours = sc.nextInt();
		value = sc.nextDouble();
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f", (hours * value));
		System.out.println();
		
		sc.close();
	}

}
