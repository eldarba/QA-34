package types.calculator;

public class Test {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		try {
			System.out.println(c.divide(100, 25));
			System.out.println(c.divide(3, 0));
			System.out.println(c.divide(10, 2));
		}catch(Exception e) {
			// if we are here an Exception was thrown
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("END");

	}

}
