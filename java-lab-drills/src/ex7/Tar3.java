package ex7;

import java.util.Arrays;

public class Tar3 {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int limit = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(arr1));

		x: for (int i = 0; i < arr1.length; i++) {
			int candidate = arr1[i];
			for (int j = 0; j < limit; j++) {
				if (arr2[j] == candidate) {
					continue x;
				}
			}
			// if we are here - this is not duplicate and should be moved to arr2
			arr2[limit] = candidate;
			limit++;
		}

		// shorten arr2 to limit
		int[] temp = new int[limit];
		System.arraycopy(arr2, 0, temp, 0, limit);
		arr2 = temp;

		System.out.println(Arrays.toString(arr2));
	}

}
