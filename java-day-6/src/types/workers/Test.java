package types.workers;

public class Test {
	
	public static void main(String[] args) {
		Worker w1 = new Worker();
		Manager w2 = new Manager();
		Manager w3 = new Manager();
		
		w1.setId(101);
		w2.setId(102);
		w2.setDepartment("Legal");
		w3.setDepartment("HR");
		
		w1.work();
		w2.work();
		w3.work();
	}

}
