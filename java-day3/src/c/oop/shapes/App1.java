package c.oop.shapes;

public class App1 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 4); // ctor 1
		Rectangle r2 = new Rectangle(); // ctor 2
		
		System.out.println(r1.length);
		System.out.println(r1.width);

		System.out.println(r2.length);
		System.out.println(r2.width);
		
		r1.printDetails();
		r2.printDetails();

	}

}
