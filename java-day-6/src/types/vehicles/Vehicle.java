package types.vehicles;

public class Vehicle {

	// filed is private so it is protected
	private int number;

	// getter let us access the value - read only
	public int getNumber() {
		return number;
	}

	// setter let us change the value with conditions
	public void setNumber(int number) {
		if (number >= 0 && number <= 99_999_999) {
			this.number = number;
		}
	}

}
