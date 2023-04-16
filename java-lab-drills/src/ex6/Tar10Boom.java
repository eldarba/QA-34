package ex6;

public class Tar10Boom {

	// 7 boom game
	public static void main(String[] args) {

		x: for (int i = 0; i <= 1500; i++) {
			// check if divides by 7
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue; // jump to end of iteration
			}

			// check if contains 7
			int temp = i;
			while (temp != 0) {
				if (temp % 10 == 7) {
					System.out.println("BOOM");
					continue x;
				}
				temp = temp / 10;
			}

			System.out.println(i);
		}

	}

}
