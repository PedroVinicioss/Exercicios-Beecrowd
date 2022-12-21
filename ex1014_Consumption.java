package Exs;

import java.util.Scanner;

public class ex1014_Consumption {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int km = 0;
		double gasoline = 0;
		
		km = sc.nextInt();
		gasoline = sc.nextDouble();
		
		double consumption = km / gasoline;

		System.out.printf("%.3f km/l", consumption);
		System.out.println();
		
		sc.close();
	}

}
