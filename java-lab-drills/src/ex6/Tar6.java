package ex6;

import java.util.Random;

public class Tar6 {

	/*
	 * Create a class that defines a random value between 0-100,000 and prints if it
	 * is a palindrome (a symmetric number like: 12321, 666, 47974, 404 …)
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(100_001);
//		r = 889988;
		int original = r;
		System.out.println(original);

		int oposit = 0;

		while (r != 0) {
			oposit *= 10;
			oposit += r % 10;
			r = r / 10;
		}

		if (original == oposit) {
			System.out.println("palindrome");
		} else {
			System.out.println("NOT palindrome");
		}

	}

}
