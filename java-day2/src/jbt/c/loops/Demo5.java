package jbt.c.loops;

import java.util.Scanner;

public class Demo5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int x = sc.nextInt();
		sc.close();
		
		int c = 0; // counter
		
		while(c <= x) {
			System.out.println(c);
			c = c + 1;
		}
	}

}
