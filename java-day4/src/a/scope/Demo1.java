package a.scope;

public class Demo1 {
	
	// the global variable is in the class level and can be used from the methods
	static int globalVar = 1000;
	
	public static void main(String[] args) {
		
		System.out.println(globalVar);
		
		int x = 100;
		System.out.println(x);
		
		{ // this is scope
			int a = 6;
			System.out.println(a);
			System.out.println(x);
		}
		System.out.println(x);
		
		{ // each scope creates a name space
			int a = 15;
			System.out.println(a);
			System.out.println(x);
		}
		
		System.out.println(x);
		// System.out.println(a); error - out of scope
	}

}
