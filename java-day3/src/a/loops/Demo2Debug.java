package a.loops;

public class Demo2Debug {
	// to run in debug mode click debug instead of run
	// step into (f5) - enter into a new running method
	// step over (f6) - just do the line of code
	// resume (f8) - run to the next breakpoint or end of program

	public static void main(String[] args) {
		System.out.println("AAA");
		System.out.println("BBB"); // break point 1 - // step over (f6)
		System.out.println("CCC"); // step over (f6)
		x(); // step into (f5)
		System.out.println("DDD"); // break point 1 - // step over (f6)
		System.out.println("EEE"); // step over (f6)
	}

	public static void x() {
		System.out.println(1); // step over (f6)
		System.out.println(2); // step over (f6)
		System.out.println(3); // step over (f6)
	}

}
