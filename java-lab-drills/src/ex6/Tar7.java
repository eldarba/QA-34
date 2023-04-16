package ex6;

public class Tar7 {

	/*
	 * Create a class that defines a random number between 0-100 and prints the
	 * factorial value [4  1 X 2 X 3 X 4
	 */
	public static void main(String[] args) {

		int r = (int) (Math.random() * 21); // 0 - 20
		long factorial = 1;

		for (int x = 2; x <= r; x++) {
			factorial = factorial * x;
		}

		System.out.println(r + "! = " + factorial);

	}

}
