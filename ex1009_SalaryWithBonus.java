package Exs;

import java.util.Scanner;

public class ex1009_SalaryWithBonus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String nome = "Null";
		double value = 0, commission = 0;
		
		nome = sc.nextLine();
		value = sc.nextDouble();
		commission = sc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f", ((commission * 0.15) + value));
		System.out.println();
		
		sc.close();
	}

}
