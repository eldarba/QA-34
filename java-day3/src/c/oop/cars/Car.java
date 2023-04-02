package c.oop.cars;

public class Car {

	int number;
	// to protect an attribute use private
	private int speed; // 0 - 110

	// to change speed use a method with checks
	void setSpeed(int speed) {
		if (speed >= 0 && speed <= 110) {
			this.speed = speed;
		}
	}

	int getSpeed() {
		return speed;
	}

}
