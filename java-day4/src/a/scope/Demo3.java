package a.scope;

public class Demo3 {

	public static void main(String[] args) {

		// loops create scope
		// the variables i and msg exist only in the loop block
		for (int i = 1; i <= 5; i++) {
			String msg = "counter is now " + i; // local to the loop
			System.out.println(msg);
		}

		// System.out.println(i); // error - i is not in memory
		// System.out.println(msg); // error - msg is not in memory

	}

}
