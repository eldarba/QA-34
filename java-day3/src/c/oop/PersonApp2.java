package c.oop;

public class PersonApp2 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Arik";
		p2.name = "Benz";
		
		System.out.println(p1.name); // Arik
		System.out.println(p2.name); // Benz

	}

}
