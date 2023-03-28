package jbt.a;

import java.util.Scanner;

public class Demo3If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt(); // input
		sc.close();
		
		if(n > 5) {
			System.out.println("Big");
		}
		
		System.out.println("Bye");
	}

}
