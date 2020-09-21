/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 15-07-2020 10:30AM
 */
package lab6;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * subclass of Person class that ask user to input each student information,
 * calculate result and print those information
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class Student extends Person {

	/**
	 * studentNumber variable to store student number
	 */
	protected int studentNumber;

	/**
	 * programName variable to store name of program in which an individual student
	 * is registered
	 */
	protected String programName;

	/**
	 * gpa variable to store gpa of students
	 */
	protected double gpa;

	/**
	 * method for input of student personal information throught keyboard(Scanner)
	 * 
	 * @param input - This is a Scanner object that is been passes inside readInfo
	 *              method
	 */
	protected void readInfo(Scanner input) {

		System.out.print("Enter program name: ");
		programName = input.next();
		System.out.print("Enter student number:");
		try {
			studentNumber = input.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.err.println("*****Input mismatch exception*****");
			input.nextLine();
		}
		System.out.print("Enter first name:");
		firstName = input.next();
		System.out.print("Enter last name:");
		lastName = input.next();
		System.out.print("Enter email Id:");
		emailId = input.next();
		System.out.print("Enter phone number:");
		try {
			phoneNumber = input.nextLong();
		} catch (InputMismatchException inputMismatchException) {
			System.err.println("*****Input mismatch exception*****");
			input.nextLine();
		}

		readMarks(input);

	}

	/**
	 * method to input number of courses and their marks from user
	 * 
	 * @param input - This is a Scanner object that is been passes inside readMarks
	 *              method
	 */
	protected void readMarks(Scanner input) {
		System.out.println("Enter number of courses:");
		int totalCourses = input.nextInt();

		// array to store marks for each subject
		double[] marks = new double[totalCourses];

		// for loop to prompt user input marks for their total subjects
		for (int counter = 0; counter < marks.length; counter++) {
			System.out.print("Enter mark " + (counter + 1) + ":");
			marks[counter] = input.nextDouble();
		}
		calculateGpa(marks);
	}

	/**
	 * method to calculate students GPA
	 * 
	 * @param marks - This objects passes marks of every subject of an individual
	 *              student
	 */
	protected void calculateGpa(double[] marks) {
		double total = 0;

		// for loop to calculate total of all marks
		for (int counter = 0; counter < marks.length; counter++) {
			total += marks[counter];
		}
		gpa = total / (marks.length * 25);
	}

	/**
	 * method to display student information and calculated GPA in tabular form
	 */
	protected void printInfo() {
		DecimalFormat format = new DecimalFormat("0.00");
		String fullName = firstName + " " + lastName;
		System.out.printf("%-15s| %-15s| %-15s| %-20s| %-10s| %-5s|", programName, studentNumber, fullName, emailId,
				phoneNumber, format.format(gpa));
	}

	/**
	 * method for input of student personal information that is stored in a file
	 * 
	 * @param input - This is a Scanner object that is been passes inside readFile
	 *              method
	 */
	protected void readFile(Scanner input) {
		studentNumber = input.nextInt();
		firstName = input.next();
		lastName = input.next();
		emailId = input.next();
		phoneNumber = input.nextLong();
		programName = input.next();
		gpa = input.nextDouble();
	}
}
