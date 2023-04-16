package ex6;

import java.util.Random;

public class Tar1 {

	/*
	 * Create a class that defines a random number and prints all numbers from 1 to
	 * that number
	 */
	public static void main(String[] args) {

		Random random = new Random();
		int r = random.nextInt(11);
		System.out.println("random: " + r);

		for(int c = 1; c <= r; c++) {
			System.out.println(c);
		}
	}

}
