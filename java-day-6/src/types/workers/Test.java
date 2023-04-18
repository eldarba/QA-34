package types.workers;

public class Test {
	
	public static void main(String[] args) {
		Worker w1 = new Worker();
		Worker w2 = new Manager();
		
		w1.setId(101);
		w2.setId(102);
		
		w1.work();
		w2.work();
	}

}
