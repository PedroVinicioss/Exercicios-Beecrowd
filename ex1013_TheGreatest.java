package Exs;

import java.util.Scanner;

public class ex1013_TheGreatest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int maiorAB = (a + b + Math.abs(a - b)) / 2;
		int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		System.out.println(maiorABC + " eh o maior");
	
		sc.close();
	}

}
