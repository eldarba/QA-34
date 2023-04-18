package types.calculator;

public class Calculator {

	public int divide(int a, int b) {
		if(b != 0) {
			int result = a / b;
			return result; // return int
		}else {
			RuntimeException e = new RuntimeException("what are you doing?");
			throw e; // throw a Throwable object
		}
		
	}

}
