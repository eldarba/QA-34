package ex7;

import java.util.Arrays;

public class Tar4 {

	/*
	 * Create a class that reverse a given array order. For example, for the input
	 * {6,8,4,2,7,5} the result should be {5,7,2,4,8,6}.
	 * 
	 * create an array[10] of numbers with random values between 0-10 to be used as
	 * an input
	 * 
	 * print the array before and after reversing
	 */
	public static void main(String[] args) {
		// create an array
		int[] arr = new int[10];
		// set the elements
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		// print
		System.out.println(Arrays.toString(arr));
		// reverse elements
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int a = arr[i];
			int b = arr[j];
			arr[i] = b;
			arr[j] = a;
		}
		// print again
		System.out.println(Arrays.toString(arr));

	}

}
