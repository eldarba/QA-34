package c;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		// prompt user to enter name
		System.out.println("Please enter your name");
		
		// to get input from user we need a special object:
		// a scanner connected to keyboard
		Scanner sc = new Scanner(System.in);
		
		// use the scanner to get input
		String userName =  sc.nextLine();
		
		// close the Scanner
		sc.close();
		
		// use the input
		System.out.println("Hello " + userName);

	}

}
