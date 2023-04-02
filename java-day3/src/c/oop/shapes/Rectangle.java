package c.oop.shapes;

public class Rectangle {
	
	// attributes
	int length;
	int width;
	
	// constructor 1
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	// constructor 2
	public Rectangle() {
	}
	
	// methods - operations the object can do
	void printDetails() {
		System.out.println("Rectangle of length " + length + " and width " + width);
	}

}
