package b;

public class DataTypes {
	
	// static - this code dosn't depend on a DataTypes object
	// void - this method dosn't return any value when done

	public static void main(String[] args) {
		// create a variable - type + name + value
		byte x1 = 100;
		System.out.println(x1);
		
		short x2 = 200;
		System.out.println(x2);
		
		int x3 = 300;
		long x4 = 400;
		
		System.out.println(x3);
		System.out.println(x4);
		
		System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		
		System.out.println("==================================");
		
		float f1 = 8.68F;
		double f2 = 5.32;
		
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println("==================================");
		char c1 = 'A';
		char c2 = 'א';
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("==================================");
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 100 > 50;
		boolean b4 = 100 < 50;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	}
	
	
	
}
