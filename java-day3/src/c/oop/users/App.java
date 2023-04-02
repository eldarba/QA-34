package c.oop.users;

public class App {

	public static void main(String[] args) {
		
		User user1 = new User(111, "Avi");
		User user2 = new User(222, "Dani");
		User user3 = new User(333, "Meir");
		
		System.out.println(user1.getId() + ", " + user1.getName());
		System.out.println(user2.getId() + ", " + user2.getName());
		System.out.println(user3.getId() + ", " + user3.getName());

	}

}
