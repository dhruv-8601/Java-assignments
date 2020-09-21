/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 22-07-2020 10:30AM
 */
package lab7;

import java.util.Scanner;

/**
 * This class contains main method that only calls FarmYard class which further
 * calls other classes
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class FarmYardTest {

	/**
	 * Main method
	 * 
	 * @param args String parameter used to store information about main method
	 */
	public static void main(String[] args) {
		FarmYard farm = new FarmYard();
		Scanner input = new Scanner(System.in);

		int option = -1;
		while (option != 3) {
			System.out.print("1. Enter details\n2. Display details" + "\n3. Exit \nEnter your choice: ");
			try {
				option = input.nextInt();
				if (option == 1) {
					farm.createAnimals(input);
				} else if (option == 2) {
					farm.printAnimals();
				} else if (option == 3) {
					System.out.println("Goodbye.... Have a nice day");
				}
			} catch (Exception e) {
				System.err.println("Error: " + e);
				input.nextLine();
				System.out.println();
			}
		}
	}
}
