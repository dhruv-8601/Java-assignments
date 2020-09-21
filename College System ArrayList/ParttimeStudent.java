/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 29-07-2020 10:30AM
 */
package lab8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * subclass of Student class the is used to seperate information of part time
 * student
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class ParttimeStudent extends Student {

	/**
	 * instance variable to store total course fees information
	 */
	private double courseFeesTotal;

	/**
	 * instance variable to store credit hour information
	 */
	private double credits;

	/**
	 * this method promt user to input additional information that is specially
	 * required for parttime student as they need addition course fees and credit
	 * hours information
	 * 
	 * @param input - This is a Scanner object that is been passes inside readInfo
	 *              method
	 */
	@Override
	protected void readInfo(Scanner input) {
		super.readInfo(input);
		System.out.print("Enter total course fees: ");
		courseFeesTotal = input.nextDouble();
		System.out.print("Enter credit hours: ");
		credits = input.nextDouble();
	}

	/**
	 * this method is used to print information of parttime students because they
	 * have additional addition course fees and credit hours information
	 */
	@Override
	protected void printInfo() {
		super.printInfo();
		DecimalFormat format = new DecimalFormat("0.00");
		System.out.printf("%-8s| %-8s| %n", courseFeesTotal, format.format(credits));
	}

	/**
	 * method for input of student total course fees and credit hours that are
	 * stored in a file
	 */
	@Override
	protected void readFile(Scanner input) {
		super.readFile(input);
		courseFeesTotal = input.nextDouble();
		credits = input.nextDouble();
	}
}
