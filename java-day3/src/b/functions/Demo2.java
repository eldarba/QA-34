package b.functions;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		int x = rand();
		System.out.println(x);

		greet("Dan"); // call the method
	}

	// a method can have a void return type
	static void greet(String userName) {
		System.out.println("Hello " + userName);
	}

	// a method can have NO parameters
	static int rand() {
		Random r = new Random();
		return r.nextInt(101);
	}

}
