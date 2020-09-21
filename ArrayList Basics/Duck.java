/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 22-07-2020 10:30AM
 */
package lab7;

import java.security.SecureRandom;

/**
 * This is a subclass of Animal class and is specifically use for Duck
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class Duck extends Animal {

	/**
	 * numberOfEggs variable to store quantity of eggs
	 */
	private int numberOfEggs;

	/**
	 * Non-argument constructor use to initialize all variables
	 */
	public Duck() {
		SecureRandom randomNumber = new SecureRandom();
		bodyCovering = "Hair";
		numberOfLegs = 2;
		numberOfEggs = 1 + randomNumber.nextInt(6);
		tax = 0;
		price = 2.5;
	}

	/**
	 * This is an override method that calculate profit for egg of duck
	 * 
	 * @return returns calculated profit for each egg of duck
	 */
	@Override
	public double findProfit() {
		double taxAmount = numberOfEggs * price * tax;
		profit = taxAmount + (numberOfEggs * price);
		return profit;
	}

	/**
	 * This is an override method that displays descriptive invoice for each egg
	 * 
	 * @param profit inputs calculated profit from findProfit method for each egg
	 */
	@Override
	public void printDetails(double profit) {
		System.out.println("I am a Duck with " + numberOfLegs + " legs, covered with " + bodyCovering + " and laid "
				+ numberOfEggs + " eggs. Price of eggs: $" + profit);
	}
}
