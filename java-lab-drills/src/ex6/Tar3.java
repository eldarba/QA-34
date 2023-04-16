package ex6;

import java.util.Random;

public class Tar3 {

	/*
	 * Create a class that defines a random number and prints all even numbers from
	 * 0 to that number
	 */
	public static void main(String[] args) {

		Random random = new Random();
		int rnd = random.nextInt(21);

		System.out.println(rnd);
		System.out.println("===============");

		for (int c = 0; c <= rnd; c += 2) {
			System.out.println(c);
		}

	}

}
