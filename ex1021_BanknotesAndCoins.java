package Exs;

import java.util.Scanner;

public class ex1021_BanknotesAndCoins {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = 0;
		
		n = sc.nextDouble();
		
		System.out.println("NOTAS:");
		System.out.println((int)n / 100 + " nota(s) de R$ 100.00");
		n = n % 100;
		System.out.println((int)n / 50 + " nota(s) de R$ 50.00");
		n = n % 50;
		System.out.println((int)n / 20 + " nota(s) de R$ 20.00");
		n = n % 20;
		System.out.println((int)n / 10 + " nota(s) de R$ 10.00");
		n = n % 10;
		System.out.println((int)n / 5 + " nota(s) de R$ 5.00");
		n = n % 5;
		System.out.println((int)n / 2 + " nota(s) de R$ 2.00");
		n = n % 2;
		
		System.out.println("MOEDAS:");
		System.out.println((int)n / 1 + " moeda(s) de R$ 1.00");
		n = n % 1;

		double m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
	
		m50 = n / 0.5;
		System.out.println((int)m50 + " moeda(s) de R$ 0.50");
		n = n % 0.5;
		m25 = n / 0.25;
		System.out.println((int)m25 + " moeda(s) de R$ 0.25");
		n = n % 0.25;
		m10 = n / 0.10;
		System.out.println((int)m10 + " moeda(s) de R$ 0.10");
		n = n % 0.10;
		m5 = n / 0.05;
		System.out.println((int)m5 + " moeda(s) de R$ 0.05");
		n = n % 0.05;
		m1 = n / 0.01;
		System.out.println((int)m1 + " moeda(s) de R$ 0.01");

	}

}
