package e.arrays;

public class Demo2 {

	public static void main(String[] args) {

		String[] names = new String[5];
		names[0] = "Ron";
		names[1] = "Danna";
		names[2] = "Vered";
		names[3] = "Roze";
		names[4] = "Rozi";

		System.out.println("number of elements: " + names.length);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
