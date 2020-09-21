/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 22-07-2020 10:30AM
 */
package lab7;

/**
 * This is a super abstract class that declare basic features of animals and
 * their behavior for selling those animal's offspring
 * 
 * @author Dhruv Bipin Patel
 */
public abstract class Animal {

	/**
	 * bodyCovering variable for storing information about each animal's body
	 * covering
	 */
	protected String bodyCovering;

	/**
	 * numberOfLegs variable to store information about number of legs each animal
	 * have
	 */
	protected int numberOfLegs;

	/**
	 * tax variable for tax on individual animal's offspring
	 */
	protected double tax;

	/**
	 * price variable to store information about cost of each animal's child
	 */
	protected double price;

	/**
	 * profit variable store profit on each animal's offspring
	 */
	protected double profit;

	/**
	 * This method is used to calculate profit on each animal's child
	 * 
	 * @return returns calculated profit
	 */
	protected abstract double findProfit();

	/**
	 * This method prints information of each animal's price, quantity and profit
	 * 
	 * @param profit inputs calculated profit from findProfit method
	 */
	protected abstract void printDetails(double profit);
}
