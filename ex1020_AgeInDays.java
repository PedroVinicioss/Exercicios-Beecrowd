package Exs;

import java.util.Scanner;

public class ex1020_AgeInDays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		n = sc.nextInt();
		
		System.out.println(n / 365 + " ano(s)");
		System.out.println((n % 365) / 30 + " meses(es)");
		System.out.println((n % 365) % 30 + " dias(s)");
		
		sc.close();
	}

}
