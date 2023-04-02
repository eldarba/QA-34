package a.loops;

import java.util.Random;

public class Demo7Ternary {

	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(11); // 0 - 10
		int b = random.nextInt(11); // 0 - 10
		System.out.println(a + ", " + b);

		int max = a > b ? a : b;

		System.out.println(max);

		// int v = boolean exp ? value : value

	}

}
