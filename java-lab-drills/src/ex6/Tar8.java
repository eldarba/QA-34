package ex6;

public class Tar8 {

	/*
	 * Create a class that defines a random number named “index” with a value
	 * between 0-50 and prints the number in Fibonacci set that is located in the
	 * “index” position
	 */
	public static void main(String[] args) {

		int index = (int) (Math.random() * 51);
		System.out.println("index is: " + index);

		long f1 = 1;
		long f2 = 1;

		for (int i = 3; i <= index; i++) {
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
		
		System.out.println("Fibonaci element is " + f2);

	}

}
