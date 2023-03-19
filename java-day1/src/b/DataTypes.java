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
		
		
		// DO NOT READ THE CODE BELOW - IT IS FOR PEOPLE ASKING ABOUT STATIC
		
		// non static method call requires an object of this class
		// create an object
		DataTypes object = new DataTypes();
		// call the method
		int theSum = object.sum(2, 4);
		System.out.println(theSum);
		
		// static method call does not require an object of this class
		theSum = sum2(3, 6);
		System.out.println(theSum);
		
	}
	
	// non static method
	public int sum(int a, int b) {
		return a + b;
	}
	
	// static method
	public static int sum2(int a, int b) {
		return a + b;
	}
	
	
}
