package jbt.a;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {

		System.out.print("enter a number: ");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		if (x % 2 == 0) {
			System.out.println("The number " + x + " is even.");
		} else {
			System.out.println("The number " + x + " is odd.");
		}

	}

}
