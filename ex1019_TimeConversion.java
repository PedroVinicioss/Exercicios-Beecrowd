package Exs;

import java.util.Scanner;

public class ex1019_TimeConversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		n = sc.nextInt();
		
		System.out.println((n / 3600) + ":" + ((n % 3600) / 60) + ":" + (n % 60));

		sc.close();
	}

}
