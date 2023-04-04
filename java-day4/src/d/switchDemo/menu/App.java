package d.switchDemo.menu;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean appActive = true;
		while(appActive) {
			showMenu();
			int input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("your work has been saved to file");
				break;
			case 2:
				System.out.println("your work has edited successfully");
				break;
			case 3:
				System.out.println("your work has been deleted from file");
				break;
			case 0:
				appActive = false;
				break;
				default:
					System.out.println("Illegal choice: " + input + ". try again");
			}
		}
		
		sc.close();
		System.out.println("Bye");
		

	}
	
	static void showMenu() {
		System.out.println();
		System.out.println("save ............. 1");
		System.out.println("edit ............. 2");
		System.out.println("delete ........... 3");
		System.out.println("exit ............. 0");
		System.out.print("enter choice: ");
	}

}
