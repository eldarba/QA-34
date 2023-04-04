package e.arrays.boxes;

import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {

		// create an array of boxes
		Box[] arr = new Box[10];
		Random random = new Random();

		// create 10 boxes and put in the array
		for (int i = 0; i < arr.length; i++) {
			// prepare dimension parameters for the box
			int length = random.nextInt(11);
			int width = random.nextInt(11);
			int height = random.nextInt(11);
			// create a box object
			Box box = new Box(length, width, height);
			// put the current box in the array
			arr[i] = box;
			System.out.println(arr[i]);
		}

	} 

}
