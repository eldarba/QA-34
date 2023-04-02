package a.loops;

public class Demo3 {

	public static void main(String[] args) {

		{ // while loop
			int x = 1; // with while we need to write the counter before the loop
			while (x <= 3) {
				System.out.println(x);
				x++; // with while we need to increment the counter inside the loop
			}
		}

		{ // for loop
			for (int x = 1; x <= 3; x++) {
				System.out.println(x);
			}

		}

	}

}
