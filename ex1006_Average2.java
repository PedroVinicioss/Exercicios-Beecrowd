package Exs;

import java.util.Scanner;

public class ex1006_Average2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A = 0, B = 0, C = 0;
		
		int x = 0;
		while(x == 0) {
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
			
			if(A >= 0 && A <= 10 && B >= 0 && B <= 10 && C >= 0 && C <= 10)
				x = 1;
			else
				System.out.println("As notas devem estar entra 0 e 10!");
		}
		
		double media = ((A * 2) + (B * 3) + (C * 5))/ 10;
		
		System.out.printf("MEDIA = %.1f", media);
		System.out.println();
		
		sc.close();
	}

}