package jbt.b;

import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {
		
		// work with random numbers
		Random random = new Random();
		
		// 0 - 10 inclusive
		int x; // variable declaration (only once per variable)
		// assign value to x
		x = random.nextInt(0, 11);
		
		System.out.println(x);
		
		// 0 - 23
		// assign value to x
		x = random.nextInt(0, 24);
		System.out.println(x);
		
		// year: 2000 - 2100
		int year = random.nextInt(2000, 2101);
		System.out.println("year is " + year);
		
		// grade 0 - 100
		int grade = random.nextInt(0, 101);
		System.out.println("grade is " + grade);

	}

}
