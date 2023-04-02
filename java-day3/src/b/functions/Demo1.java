package b.functions;

public class Demo1 {

	public static void main(String[] args) {
		// function call - use
		int x = sum(100, 200);
		System.out.println(x);
	} // end of main
	
	// function definition
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	} 

}
