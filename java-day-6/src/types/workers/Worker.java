package types.workers;

public class Worker {

	private int id;
	private String name;
	
	public void work() {
		System.out.println("worker " + id + " is working");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
