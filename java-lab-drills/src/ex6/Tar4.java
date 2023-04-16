package ex6;

import java.util.Random;

public class Tar4 {

	/*
	 * Create a class that defines two random values ‘big’ and ‘small’ and prints
	 * all the numbers from 0 to ‘big’ that can be divided with ‘small’
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int small = random.nextInt(11);
		int big = random.nextInt(101) + small;

		System.out.println("big: " + big);
		System.out.println("small: " + small);
		
		for(int c = 0; c <= big; c += small) {
			System.out.println(c);
		}

	}

}
