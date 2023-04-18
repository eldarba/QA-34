package types.vehicles;

public class Test {

	public static void main(String[] args) {
		
		VehicleManager manager = new VehicleManager();
		
		Car car1 = new RaceCar();
		car1.setNumber(101);
		Car car2 = new RaceCar();
		car2.setNumber(102);
		
		// adding cars
		int indexCar1 = manager.addCar(car1);
		int indexCar2 = manager.addCar(car2);
		
		System.out.println(manager.getCar(indexCar1).getNumber());
		System.out.println(manager.getCar(indexCar2).getNumber());
		
		// adding ships
		Ship ship = new Ship();
		manager.addShip(ship);
		
		

	}

}
