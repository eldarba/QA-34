package c;

/*
 * this is line 1
 * this is line 2
 * this is line 3
 * 
 * */

import java.util.Scanner;

public class Tar3 {

	/**
	 * this is an example of java operators
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		int a = sc.nextInt();
		System.out.print("enter second number: ");
		int b = sc.nextInt();
		sc.close();

		int sum = a + b;
		int dif = a - b;
		int mul = a * b;
		int div = a / b;
		int rem = a % b; // use modulus remainder

		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + dif);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + div + " [" + rem + "]");

	}

}
