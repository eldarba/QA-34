package ex5;

import java.util.Random;

public class Tar5 {

	/*
	 * Create a class that defines 3 random numbers and prints the bigger value
	 */
	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(101);
		int b = random.nextInt(101);
		int c = random.nextInt(101);

		System.out.println("a=" + a + ", " + " b=" + b + ", " + " c=" + c);

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
