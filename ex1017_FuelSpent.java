package Exs;

import java.util.Scanner;

public class ex1017_FuelSpent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hours = 0, speed = 0;
		
		hours = sc.nextInt();
		speed = sc.nextInt();
		
		double gasoline = (hours * speed) / 12.0;
		
		System.out.printf("%.3f", gasoline);
		System.out.println();
	}

}
