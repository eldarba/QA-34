package oop;

public class Test2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		RaceCar raceCar = new RaceCar();
		raceCar.fly();
		
		// polymorphism - use a higher reference to the object
		Car car2 = new RaceCar();
		// car2.fly();

	}

}
