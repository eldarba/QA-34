package jbt.c.loops;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		int min = 18;
		int max = 120;

		Scanner scanner = new Scanner(System.in);

		System.out.print("enter age: ");
		int age = scanner.nextInt();

		while (age < min || age > max) {
			System.out.print("ilegal age. enter again: ");
			age = scanner.nextInt();
		}

		scanner.close();
		System.out.println("Age is " + age);

	}

}
