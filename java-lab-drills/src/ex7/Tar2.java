package ex7;

import java.util.Arrays;

public class Tar2 {

	/*
	 * Create a class that creates an array[50] of numbers with random values
	 * between 0-100 and prints the highest value and its index in the array
	 */
	public static void main(String[] args) {

		int[] arr = new int[50];
		int max = 0;
		int indexMax = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("maximum: " + max);
		System.out.println("index: " + indexMax);
	}
}
