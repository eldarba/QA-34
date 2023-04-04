package e.arrays;

import java.util.Arrays;
import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {
		
		// create an array object
		int[] arr = new int[5];
		// insert data to the array
		arr[0] = 70;
		arr[1] = 100;
		arr[2] = 90;
		arr[3] = 60;
		arr[4] = 30;
		// print the array elements
		System.out.println(Arrays.toString(arr));
		// print an element at specific index
		System.out.println("forth grade is: " + arr[3]);
		
	}

}
