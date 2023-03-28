package jbt.a;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {

		System.out.println("enter hour [0 - 23]");
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt() % 24;
		sc.close();

		System.out.println("You chose to meet at " + hour);
		
		// display a message only if the meeting can be held
		// check that hour is before 14 OR after 16 
		if(hour < 14 || hour > 16) {
			System.out.println("The meeting can be held");
		}else {
			System.out.println("The meeting can't be held at this hour");
		}

	}

}
