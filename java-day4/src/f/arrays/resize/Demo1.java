package f.arrays.resize;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// create an array of length 5
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		// add 2 more elements - 100, 200
		// 1. create a longer array
		int[] temp = new int[arr.length + 2];
		// 2. copy all elements
		System.arraycopy(arr, 0, temp, 0, arr.length);
		// 3. change address for the arr reference
		arr = temp;
		// 4. add the 100 and 200 elements
		arr[5] = 100;
		arr[6] = 200;

		System.out.println(Arrays.toString(arr));

	}

}
