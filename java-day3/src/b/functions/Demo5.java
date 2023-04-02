package b.functions;

import java.util.Random;

public class Demo5 {

	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(101); // 0 - 100
		int b = random.nextInt(101); // 0 - 100

		evenOrOdd(a);
		evenOrOdd(b);
	}

	static void evenOrOdd(int val) {
		if (val % 2 == 0) {
			System.out.println("The  number " + val + " is even");
		} else {
			System.out.println("The  number " + val + " is odd");
		}
	}

}
