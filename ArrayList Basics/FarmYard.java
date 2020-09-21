/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 22-07-2020 10:30AM
 */
package lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is used to call Animal, Cow and Duck class to use them as per user
 * input
 * 
 * @author dhruv
 *
 */
public class FarmYard {

	/**
	 * Declaring array list of Animal class
	 */
	ArrayList<Animal> animals;

	/**
	 * No-argument constructor use to initialize array list of Animal class
	 */
	FarmYard() {
		animals = new ArrayList<Animal>();
	}

	/**
	 * This class ask user to input choice to select calf or egg
	 * 
	 * @param input This is Scanner object that is been passed inside createAnimal
	 *              method
	 */
	public void createAnimals(Scanner input) {
		int choice = 0;

		try {
			System.out.println("1.Cow");
			System.out.println("2.Duck");
			System.out.print("Enter your choice: ");

			choice = input.nextInt();
			Animal a = null;
			if (choice == 1) {
				a = new Cow();
				a.findProfit();
			} else if (choice == 2) {
				a = new Duck();
				a.findProfit();
			}
			animals.add(a);
		} catch (InputMismatchException e) {
			System.err.println("Error: " + e);
			input.nextLine();
		} catch (Exception e) {
			System.err.println("Error: " + e);
			input.nextLine();
		}
	}

	/**
	 * This method is used to display each and every animals store in array list
	 */
	public void printAnimals() {
		if (animals.size() == 0) {
			System.out.println("No animals in the array list.\n");
			return;
		}

		for (int count = 0; count < animals.size(); count++) {
			double income = animals.get(count).findProfit();
			animals.get(count).printDetails(income);
		}
	}
}
