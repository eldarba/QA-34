package c;

import java.util.Scanner;

public class Tar3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		int a = sc.nextInt();
		System.out.print("enter second number: ");
		int b = sc.nextInt();
		sc.close();
		
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);

	}

}
