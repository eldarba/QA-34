package b.exeptions;

public class Test {

	public static void main(String[] args) {

		System.out.println(Point.MIN);
		System.out.println(Point.MAX);

		// create a Point object with x, y
		Point p1 = new Point(70, 30);
		// print it
		System.out.println(p1);

		// set the x, y of the existing object
		try {
			p1.setX(608); // throws an exception
			p1.setY(50);
			// print it
			System.out.println(p1);
		} catch (PointXYException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
