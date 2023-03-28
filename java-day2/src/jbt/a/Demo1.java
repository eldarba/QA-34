package jbt.a;

public class Demo1 {
	
	public static void main(String[] args) {
		
		// to perform input we need the Scanner object:
		// we want input from keyboard - System.in
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		// perform the input operation
		System.out.println("enter first number");
		int x = scanner.nextInt();
		System.out.println("enter second number");
		int y = scanner.nextInt();
		
		// perform the output operation of x
		System.out.println("the numbers entered are:");
		System.out.println(x);
		System.out.println(y);
		
		// close the scanner
		scanner.close();
	}
}


