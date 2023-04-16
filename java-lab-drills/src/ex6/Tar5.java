package ex6;

import java.util.Random;

public class Tar5 {

	/*
	 * Create a class that defines a random number with value between 0-10,000 and
	 * print the following details with clear messages:
	 * 
	 * number of digits [4867 --> 4]
	 * 
	 * the first left digit [ 6843 --> 6]
	 * 
	 * sum of the number’s digits [ 473 --> 14]
	 * 
	 * opposite order of the number’s digits [5892 --> 2985]
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(10_001);
		System.out.println(r);

		int numberOfDigits = 0;
		int leftDigit = 0;
		int sumOfDigits = 0;
		int oposit = 0;

		while (r != 0) {
			oposit *= 10;
			oposit += r % 10;
			if (r < 10) {
				leftDigit = r;
			}
			sumOfDigits += r % 10;
			numberOfDigits++;
			r = r / 10;
		}

		numberOfDigits = numberOfDigits != 0 ? numberOfDigits : 1;
		System.out.println("number of digits is " + numberOfDigits);
		System.out.println("left digit is " + leftDigit);
		System.out.println("sum of digits is " + sumOfDigits);
		System.out.println("oposit number is " + oposit); 
	}

}
