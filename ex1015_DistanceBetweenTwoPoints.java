package Exs;

import java.util.Scanner;

public class ex1015_DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		double distance = Math. sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("%.4f", distance);
		System.out.println();
		
		sc.close();
	}

}
