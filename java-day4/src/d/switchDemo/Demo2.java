package d.switchDemo;

public class Demo2 {

	public static void main(String[] args) {

		int key = 1; // 1, 2, 3

		switch (key) {
		case 1:
			System.out.println("ONE");
			break; // break takes us out of the switch
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		}

	}

}
