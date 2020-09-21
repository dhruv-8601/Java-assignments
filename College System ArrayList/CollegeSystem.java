/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 29-07-2020 10:30AM
 */
package lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this is main method class that runs all other inheritance and college class
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class CollegeSystem {
	/**
	 * 
	 * @param args - use to store information for main method
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// for user to enter college name
		System.out.print("Enter name of College: ");
		String name = input.nextLine();

		// for user to enter total number of students
		System.out.print("Enter number of students: ");
		int n = 0;
		try {
			n = input.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.err.println("*****Input mismatch exception*****");
			input.nextLine();
		}

		// creating reference of college parameterized constructor
		College c1 = new College(name, n);
		int choice;
		do {
			System.out.println("\n1. Register Students");
			System.out.println("2. Display Students");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n1. Read from file");
				System.out.println("2. Read from keyboard");
				System.out.print("Enter your option: ");

				int fileChoice = input.nextInt();
				if (fileChoice == 1) {
					c1.readFromFile(input);
				} else if (fileChoice == 2) {
					c1.readStudentsDetails(input);
				} else {
					System.err.println("Please select a number from the given option");
				}
				break;
			case 2:
				c1.printTitle();
				c1.printStudentDetails();
				break;
			case 3:
				System.out.println("\nGood Bye! Have a Nice Day :)");
				break;
			default:
				System.err.println("Please select a number from the given option");
			}
		} while (choice != 3);

		input.close();
	}
}
