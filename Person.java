/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 15-07-2020 10:30AM
 */
package lab6;

import java.util.Scanner;

/**
 * This is a super abstract class that describes general information of a
 * Person
 * 
 * @author Dhruv Bipin Patel
 *
 */
public abstract class Person {

	/**
	 * firstName variable to store first name of person
	 */
	protected String firstName;

	/**
	 * lastName variable to store last name of person
	 */
	protected String lastName;

	/**
	 * emailId variable to store email Id of person
	 */
	protected String emailId;

	/**
	 * phoneNumber variable to store phone number of person
	 */
	protected long phoneNumber;

	/**
	 * This abstract method read information from use through keyboard input
	 * 
	 * @param input - This is a Scanner object that is been passes inside readInfo
	 *              method
	 */
	protected abstract void readInfo(Scanner input);

	/**
	 * This abstract method print formated information from array
	 */
	protected abstract void printInfo();

}
