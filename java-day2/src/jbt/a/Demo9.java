package jbt.a;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {

		System.out.println("enter a year");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		sc.close();

		System.out.println("The year is: " + year);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("This is a leap year.");
		}else {
			System.out.println("This is NOT a leap year.");
		}

	}

}
