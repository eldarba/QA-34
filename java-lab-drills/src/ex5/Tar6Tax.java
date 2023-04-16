package ex5;

import java.util.Random;

public class Tar6Tax {

	/*
	 * Salary taxes are calculated according to the following:
	 * 
	 * 0- 23,000 nis -> tax rate is 10%
	 * 
	 * 23,000- 50,000 nis -> tax rate is 20%
	 * 
	 * 50,000- 100,000 nis -> tax rate is 30%
	 * 
	 * 100,000 - up nis -> tax rate is 40%
	 * 
	 * Create a class named “TaxCalculator” that takes a salary of an employee
	 * (randomize a value to be used as an input) and prints the valid value after
	 * tax calculation
	 */
	public static void main(String[] args) {
		Random random = new Random();
		double salary = random.nextInt(120_000);
		System.out.println("salary bruto: " + salary);

		double tax = 0;

		if (salary <= 23_000) {
			// earns no more than 23,000
			tax = salary * 0.1;
		} else {
			// earns more than 23,000
			tax = 23_000 * 0.1; // take 10% for the first grade
			if (salary <= 50_000) {
				// earns no more than 50,000
				tax += (salary - 23_000) * 0.2;
			} else {
				// earns more than 50,000
				tax += (50_000 - 23_000) * 0.2; // take 20% for the second grade
				if (salary <= 100_000) {
					// earns no more than 100,000
					tax += (salary - 50_000) * 0.3;
				} else {
					// earns more than 100,000
					tax += (100_000 - 50_000) * 0.3; // take 30% for the third grade
					tax += (salary - 100_000) * 0.4; // take 40% for the rest
				}
			}
		}

		System.out.println("tax: " + tax);
		System.out.println("net salary: " + (salary - tax));

	}

}
