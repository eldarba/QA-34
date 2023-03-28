package jbt.b;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {

		Random random = new Random();

		int price1 = random.nextInt(100, 200);
		int price2 = random.nextInt(100, 200);
		int price3 = random.nextInt(100, 200);
		int price4 = random.nextInt(100, 200);
		int price5 = random.nextInt(100, 200);

		System.out.println(price1);
		System.out.println(price2);
		System.out.println(price3);
		System.out.println(price4);
		System.out.println(price5);

		double avg = (price1 + price2 + price3 + price4 + price5) / 5D;
		System.out.println("average: " + avg);

	}

}
