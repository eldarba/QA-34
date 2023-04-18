package types.workers;

public class Manager extends Worker {

	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// method override
	public void work() {
		System.out.println("manager " + getId() + " is managing at the " + department + " department");
	}

}
