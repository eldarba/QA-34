package a.loops;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter first number: ");
		int a = sc.nextInt();

		System.out.print("enter second number: ");
		int b = sc.nextInt();

		sc.close();

//		int step = 1;
//		if (a > b) {
//			step = -1;
//		}

		int step = a <= b ? 1 : -1; // using ternary operator we can write shorter code

		for (int c = a; c != b; c = c + step) {
			System.out.println(c);
		}

		System.out.println(b);

	}

}
