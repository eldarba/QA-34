package jbt.a;

import java.util.Scanner;

public class Demo4IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt(); // input
		sc.close();
		
		if(n > 5) {
			System.out.println("Big");
		}else {
			System.out.println("Small");
		}
		
		System.out.println("Bye");
	}

}
