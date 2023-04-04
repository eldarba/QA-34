package e.arrays;

import java.util.Arrays;
import java.util.Random;

public class Demo3 {

	public static void main(String[] args) {

		int[] grades = new int[200];
		Random random = new Random();

		for (int i = 0; i < grades.length; i++) {
			int grade = random.nextInt(101); // 0 - 100
			grades[i] = grade;
		}

		System.out.println(Arrays.toString(grades));

	}

}
