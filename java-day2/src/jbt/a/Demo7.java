package jbt.a;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {

		System.out.print("Enter your age: ");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();

		// check if age value is legal
		if (age >= 0 && age <= 120) {
			System.out.println("Your age is: " + age);
		} else {
			System.out.println("Illegal age");
		}
	}

}
