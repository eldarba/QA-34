package ex7;

import java.util.Arrays;
import java.util.Iterator;

public class Tar5 {

	/*
	 * Create a class that calculates student average year grade.
	 * 
	 * create a matrix according to the following:
	 * 
	 * - there are 20 students in class
	 * 
	 * - there are 10 different grades per student (randomize values between 0-100
	 * as input)
	 * 
	 * o print each student average grade
	 * 
	 * o print the class average grade
	 */
	public static void main(String[] args) {
		int numberOfStudets = 20;
		int numberOfGradesPerStudent = 10;
		int[][] grades = new int[numberOfStudets][numberOfGradesPerStudent];
		int totalGradesAvg = 0;

		for (int iStd = 0; iStd < grades.length; iStd++) {
			int studentGradesSum = 0;
			for (int iGrd = 0; iGrd < grades[iStd].length; iGrd++) {
				grades[iStd][iGrd] = (int) (Math.random() * 101);
				studentGradesSum += grades[iStd][iGrd];
			}
			double stdAvg = (double) studentGradesSum / numberOfGradesPerStudent;
			System.out.println(Arrays.toString(grades[iStd]) + " avg: " + stdAvg);
			totalGradesAvg += stdAvg;
		}
		double classAvg = totalGradesAvg / numberOfStudets;
		System.out.println("\nclass average: " + classAvg);
	}

}
