package ex5;

import java.util.Random;

public class Tar2 {

	/*
	 * Create a new class that defines a random number with a value between 0-100.
	 * 
	 * if the number is greater than 50 – print “Big !”
	 * 
	 * if the number is less then 50 – print “Small !”
	 * 
	 * if the number equals to 50 – print “Bingo !”
	 */

	public static void main(String[] args) {

		Random random = new Random();
		int val = random.nextInt(11);
		System.out.println(val);

		if (val > 5) {
			System.out.println("BIG");
		} else if (val < 5) {
			System.out.println("SMALL");
		}else {
			System.out.println("BINGO");
		}
	}

}
