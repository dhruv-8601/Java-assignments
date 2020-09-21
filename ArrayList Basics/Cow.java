/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 22-07-2020 10:30AM
 */
package lab7;

import java.security.SecureRandom;

/**
 * This is a subclass of Animal class and is specifically use for Cow
 * 
 * @author Dhruv Bipin Patel
 */
public class Cow extends Animal {

	/**
	 * numberOfCalves variable to store quantity of calves
	 */
	private int numberOfCalves;

	/**
	 * Non-argument constructor use to initialize all variables
	 */
	public Cow() {
		SecureRandom randomNumber = new SecureRandom();
		bodyCovering = "Hair";
		numberOfLegs = 4;
		numberOfCalves = 1 + randomNumber.nextInt(9);
		tax = 0.13;
		price = 1 + randomNumber.nextInt(3000);
	}

	/**
	 * This is an override method that calculate profit for calves
	 * 
	 * @return returns calculated profit for each calf
	 */
	@Override
	public double findProfit() {
		double taxAmount = numberOfCalves * price * tax;
		profit = taxAmount + (numberOfCalves * price);
		return profit;
	}

	/**
	 * This is an override method that displays descriptive invoice for each calf
	 * 
	 * @param profit inputs calculated profit from findProfit method for each calf
	 */
	@Override
	public void printDetails(double profit) {
		System.out.println("I am a Cow with " + numberOfLegs + " legs, covered with " + bodyCovering + " and has "
				+ numberOfCalves + " calves. Price of calves: $" + profit);
	}
}
