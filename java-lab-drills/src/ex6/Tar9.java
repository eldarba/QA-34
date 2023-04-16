package ex6;

public class Tar9 {

	/*
	 * Create a class that defines a random value between 0-50 and prints Fibonacci
	 * set from 1 to that value
	 */
	public static void main(String[] args) {

		int limit = (int) (Math.random() * 500) + 1; // 1 - 500
//		limit = 6;
		
		System.out.println("limit is: " + limit);

		long f1 = 1;
		long f2 = 1;

		while (f1 <= limit ) {
			System.out.print(f1 + ", ");
			f2 = f1 + f2;
			f1 = f2 - f1;
		}


	}

}
