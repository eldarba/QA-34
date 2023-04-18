package b.exeptions;

/**
 * A point has x and y value in the range 0 - 100
 *
 */
public class Point {

	// constants - class variables that cannot be changed
	public static final int MIN = 0;
	public static final int MAX = 100;

	// attributes - instance variables that can be changed
	private int x;
	private int y;

	// CTOR 1
	public Point() {
		super();
	}

	// CTOR 2
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// toString method gives a text representation of an object
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws PointXYException {
		if (x >= MIN && x <= MAX) {
			this.x = x;
		}else {
			throw new PointXYException("illegal x value: " + x);
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws PointXYException {
		if (y >= MIN && y <= MAX) {
			this.y = y;
		}else {
			throw new PointXYException("illegal y value: " + y);
		}
	}

}
