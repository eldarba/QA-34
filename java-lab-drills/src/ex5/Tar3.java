package ex5;

import java.util.Random;

public class Tar3 {

	/*
	 * Create a new class that defines a random number with a value between 0-100.
	 * 
	 * if the value is between 0-50 – print “Small !”
	 * 
	 * else – print “Big !”
	 * 
	 * in addition :
	 * 
	 * if the value is even (can be divided by 2) – print “Even”
	 * 
	 * else – print “Odd”
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int val = random.nextInt(101);
		System.out.print(val + " is ");

		if (val < 50) {
			System.out.print("small");
		} else {
			System.out.print("big");
		}

		System.out.print(" and ");

		if (val % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
