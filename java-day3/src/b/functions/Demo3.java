package b.functions;

import java.util.Random;

public class Demo3 {

	public static void main(String[] args) {
		int min = 100;
		int max = 105;
		int r = rand(min, max);
		System.out.println(r);
	}

	static int rand(int min, int max) {
		Random random = new Random();
		int r = random.nextInt(max - min + 1) + min;
		return r;
	}

}
