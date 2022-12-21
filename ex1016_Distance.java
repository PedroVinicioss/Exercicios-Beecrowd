package Exs;

import java.util.Scanner;

public class ex1016_Distance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		x = sc.nextInt();
		
		int distance = x * 60 / 30;
		
		System.out.println(distance + " minutos");
		
		sc.close();
	}

}
