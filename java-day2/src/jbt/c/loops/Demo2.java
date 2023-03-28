package jbt.c.loops;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int password = 123;

		System.out.println("enter password");
		int input = scanner.nextInt();

		while (input != password) {
			System.out.println("enter password");
			input = scanner.nextInt();
		}

		System.out.println("You are logged in");
		scanner.close();
	}

}
