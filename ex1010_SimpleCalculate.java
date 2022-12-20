package Exs;

import java.util.Scanner;

public class ex1010_SimpleCalculate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = 0, amount = 0;
		double value = 0, total = 0;
		
		for(int i = 0; i <= 1; i++) {
			id = sc.nextInt();
			amount = sc.nextInt();
			value = sc.nextDouble();
			
			double c = amount * value;
			total = c + total;
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		System.out.println();
		
		sc.close();
	}

}
