package jbt.c.loops;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		int password = 123;
		System.out.println("enter password");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		if (input == password) {
			System.out.println("You are logged in");
		} else {
			System.out.println("Login failed");
		}

	}

}
