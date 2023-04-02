package b.functions;

import java.util.Random;

public class Demo4 {

	public static void main(String[] args) {
		Random r = new Random();
		// 10 - 20
		int x = r.nextInt(20 - 10 + 1) + 10;
		System.out.println(x);

	}

}
