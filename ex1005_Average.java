package Exs;

import java.util.Scanner;

public class ex1005_Average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A = 0, B = 0;
		
		int x = 0;
		while(x == 0) {
			A = sc.nextDouble();
			B = sc.nextDouble();
			
			if(A >= 0 && A <= 10 && B >= 0 && B <= 10)
				x = 1;
			else
				System.out.println("As notas devem estar entra 0 e 10!");
		}
		
		double media = ((A * 3.5) + (B * 7.5))/ 11;
		
		System.out.printf("MEDIA = %.5f", media);
		System.out.println();
		
		sc.close();
	}

}
