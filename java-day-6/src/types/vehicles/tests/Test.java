package types.vehicles.tests;

import types.vehicles.Vehicle;

public class Test {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		// v.number = -600;
		v.setNumber(600);
		System.out.println(v.getNumber());

	}

}
