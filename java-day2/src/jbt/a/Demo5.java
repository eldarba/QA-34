package jbt.a;

import java.util.Scanner;

public class Demo5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int a = sc.nextInt();

		System.out.print("enter second number: ");
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.print("The biggest number is: ");
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
