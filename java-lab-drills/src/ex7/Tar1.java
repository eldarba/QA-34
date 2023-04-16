package ex7;

import java.util.Arrays;

public class Tar1 {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and prints the total sum and the average
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*11);
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("sum: " + sum);
		
		double avg = (double)sum / arr.length;
		System.out.println("average: " + avg);

	}

}
