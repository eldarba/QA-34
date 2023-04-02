package a.loops;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter first number: ");
		int a = sc.nextInt();

		System.out.print("enter second number: ");
		int b = sc.nextInt();

		sc.close();

		if (a > b) { // make sure a is not the big number
			int temp = a;
			a = b;
			b = temp;
		}

		for (int c = a; c <= b; c++) {
			System.out.println(c);
		}

	}

}
