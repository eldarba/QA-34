package selenium.over.junit;

public class Calculator {
	
	private int result;
	
	public void add(int val) {
		result += val;
	}
	
	public void clear() {
		result = 0;
	}

	public int getResult() {
		return result;
	}

	
}
