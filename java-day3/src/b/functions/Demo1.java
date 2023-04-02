package b.functions;

public class Demo1 {

	public static void main(String[] args) {
		// function call - use
		// to call a function we use its identifier and send arguments
		int x = sum(100, 200);
		System.out.println(x);
		
		System.out.println(sum(100, 5));
		System.out.println(sum(3, 2));
		System.out.println(sum(17, 4));
		System.out.println(sum(100, 200));
	}

	// function definition
	// 1. return type
	// 2. Identifier - method name
	// 3. parameters
	// - the 3 parts above are called method signature
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	

}
