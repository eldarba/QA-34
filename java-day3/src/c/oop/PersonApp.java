package c.oop;

public class PersonApp {

	public static void main(String[] args) {
		// creating a simple variable - primitive
		int x = 5;
		System.out.println(x);
		System.out.println("===============");
		
		// creating a complex variable - object
		Person p1 = new Person();
		
		// assign value to each attribute
		p1.id = 101;
		p1.name = "Dan";
		p1.age = 25;
		
		// print the object attributes
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);

	}

}
