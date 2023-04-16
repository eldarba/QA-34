package ex6;

import java.util.Random;

public class Tar2 {

	/*
	 * Create a class that defines two random values and prints all values between
	 * them. note - which variable holds the higher value is not known.
	 */
	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(21);
		int b = random.nextInt(21);

		System.out.println(a + ", " + b);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		for (int c = a; c <= b; c++) {
			System.out.println(c);
		}

	}

}
