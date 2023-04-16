package ex5;

import java.util.Random;

public class Tar6_BTax {

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

		if (salary >= 0 && salary <= 23_000) {
			tax += salary * 0.1;
		} else if (salary > 23_000 && salary <= 50_000) {
			tax += 23_000 * 0.1;
			tax += (salary - 23_000) * 0.2;
		} else if (salary > 50_000 && salary <= 100_000) {
			tax += 23_000 * 0.1;
			tax += 27_000 * 0.2;
			tax += (salary - 50_000) * 0.3;
		} else if (salary > 100_000) {
			tax += 23_000 * 0.1;
			tax += 27_000 * 0.2;
			tax += 50_000 * 0.3;
			tax += (salary - 100_000) * 0.4;
		}

		System.out.println("tax: " + tax);
		System.out.println("net salary: " + (salary - tax));

	}

}
