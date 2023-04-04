package e.arrays;

public class Demo4 {

	public static void main(String[] args) {
		// CREATING ARRAYS OPTION 1:
		// create an array
		int[] arr1 = new int[3];
		// put elements
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;

		// CREATING ARRAYS OPTION 2:
		int[] arr2 = { 100, 200, 300 };

		// ARRAY BOUNDS
		System.out.println(arr2[0]); // first element is index 0
//		System.out.println(arr2[-1]); // error - out of bounds

		System.out.println(arr2[2]); // last element is index length-1
//		System.out.println(arr2[3]); // error - out of bounds

	}

}
