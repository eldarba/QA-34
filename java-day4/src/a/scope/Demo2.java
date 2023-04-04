package a.scope;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {

		Random random = new Random();
		int x = random.nextInt(11); // 0 - 10

		// if construct creates a block
		if (x > 5) {
			String msg = "this is a big number " + x; // local to the if block
			System.out.println(msg);
		} else {
			String msg = "this is a small number " + x; // local to the if block
			System.out.println(msg);
		}

	}

}
