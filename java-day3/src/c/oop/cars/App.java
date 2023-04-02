package c.oop.cars;

public class App {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println("car speed: " + car.getSpeed());
		
		car.setSpeed(60); // change speed to 60
		System.out.println("car speed: " + car.getSpeed());
		
		// נסו לקבוע מהירות לא הגיונית והדפיסו שוב
		car.setSpeed(-4000); // no effect
		System.out.println("car speed: " + car.getSpeed());

	}

}
