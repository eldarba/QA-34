package e.arrays.dimentions;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[][] cinema = new int[3][7];
		print(cinema);
		System.out.println("===============");
		
		cinema[0][0] = 1;
		print(cinema);
		System.out.println("===============");
		
		cinema[2][6] = 1;
		print(cinema);
		System.out.println("===============");

	}
	
	static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
