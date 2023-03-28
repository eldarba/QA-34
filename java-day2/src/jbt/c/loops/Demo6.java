package jbt.c.loops;

public class Demo6 {

	public static void main(String[] args) {

		int numberOfStudentsInClass = 10;
		System.out.println(numberOfStudentsInClass); // 10

		// long increment by 1
		numberOfStudentsInClass = numberOfStudentsInClass + 1;
		System.out.println(numberOfStudentsInClass); // 11

		// short increment by 1
		numberOfStudentsInClass++;
		System.out.println(numberOfStudentsInClass); // 12

		// print and then increment
		System.out.println(numberOfStudentsInClass++); // 12
		System.out.println(numberOfStudentsInClass); // 13

		// increment and then print 
		System.out.println(++ numberOfStudentsInClass); // 14
		System.out.println(numberOfStudentsInClass); // 14

	}

}
