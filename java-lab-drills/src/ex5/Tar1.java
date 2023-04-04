package ex5;

import java.util.Random;

public class Tar1 {

	/*
	 * Create a class that defines 2 random numbers and prints the bigger value
	 */
	public static void main(String[] args) {
		
		Random random = new Random();
		int a = random.nextInt(101);
		int b = random.nextInt(101);
		System.out.println(a + ", " + b);

		int max = a > b ? a : b;
		System.out.println("max is: " + max);

	}

}
