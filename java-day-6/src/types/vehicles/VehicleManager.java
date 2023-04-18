package types.vehicles;

/**
 * a VehicleManager object manages collections of vehicles.
 */
public class VehicleManager {

	private Car[] cars = new Car[150];
	private int carIndex;
	private Airplane[] airplanes = new Airplane[5];
	private int airplaneIndex;
	private Ship[] ships = new Ship[10];
	private int shipsIndex;

	public int addCar(Car car) {
		cars[carIndex] = car;
		carIndex++;
		return carIndex - 1;
	}

	public Car getCar(int index) {
		return cars[index];
	}

	public int addAirplane(Airplane airplane) {
		airplanes[airplaneIndex++] = airplane;
		return airplaneIndex-1;
	}

	public int addShip(Ship ship) {
		ships[shipsIndex++] = ship;
		return shipsIndex - 1;
	}

}
