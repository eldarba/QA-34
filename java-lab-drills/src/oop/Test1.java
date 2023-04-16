package oop;

public class Test1 {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.number);
		System.out.println(car.speed);
		System.out.println(car.km);
		System.out.println(car.make);
		System.out.println(car.color);
		car.drive();
		
		RaceCar raceCar = new RaceCar();
		System.out.println(raceCar.number);
		System.out.println(raceCar.speed);
		System.out.println(raceCar.km);
		System.out.println(raceCar.make);
		System.out.println(raceCar.color);
		System.out.println(raceCar.turbo);
		System.out.println(raceCar.parchute);
		raceCar.drive();
		raceCar.fly();

	}

}
