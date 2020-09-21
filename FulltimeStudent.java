/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 15-07-2020 10:30AM
 */

package lab6;

import java.util.Scanner;

/**
 * subclass of Student class the is used to seperate information of full time
 * student
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class FulltimeStudent extends Student {

	/**
	 * instance variable to store tuition fees information
	 */
	private double tuitionFees;

	/**
	 * this method promt user to input additional information that is specially
	 * required for fulltime student as they need addition tuition fees information
	 * 
	 * @param input This is a Scanner object that is been passes inside readInfo
	 *              method
	 */
	@Override
	protected void readInfo(Scanner input) {
		super.readInfo(input);
		System.out.print("Enter tuition fees: ");
		tuitionFees = input.nextDouble();
	}

	/**
	 * this method is used to print infromation of fulltime students because they
	 * have additional tuition fees
	 */
	@Override
	protected void printInfo() {
		super.printInfo();
		System.out.printf("%-8s| %n", tuitionFees);
	}

	/**
	 * method for input of student tuition fees that is stored in a file
	 */
	@Override
	protected void readFile(Scanner input) {
		super.readFile(input);
		tuitionFees = input.nextDouble();
	}
}
