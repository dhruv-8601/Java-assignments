import java.text.DecimalFormat;//input statement to get input

/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Course: CST8110
 * Semister: W20
 * Assignment 2
 * Due Date: April 12, 2020, 11:59PM
 */

// public class Employee
// this method does not have any main method
public class Employee {

	// declaring variables for entire class
	private String name;
	private int number;
	private double salary;
	
	DecimalFormat df = new DecimalFormat("0.00");

	// No Argument constructor
	public Employee() {
		this("unknown", -1, 0.0);
	}

	// Parameterized Constructor
	public Employee(String name, int number, double salary) {
		this.name = name;
		this.number = number;
		setSalary(salary);
	}

	// getter for name variable
	public String getName() {
		return name;
	}
	
	// setter for name variable
	private void setName(String name) {
		this.name = name;
	}

	// getter for number variable
	public int getNumber() {
		return number;
	}

	// setter for number variable
	private void setNumber(int number) {
		this.number = number;
	}

	// getter for salary variable
	public double getSalary() {
		return salary;
	}

	// setter for salary variable
	private void setSalary(double salary) {
		if (salary < 0) {
			this.salary = 52000;
		} else {
			this.salary = salary;
		}
	}

	// this method is use to calculate weekly pay of employees
	public double calculateWeeklyPay() {
		
		// declaring and initializing local variables
		final double first_bracket = 48535;
		final double second_bracket = 97069;
		final double third_bracket = 150473;
		final double fourth_bracket = 214368;

		final double first_percent = 0.15;
		final double second_percent = 0.205;
		final double third_percent = 0.26;
		final double fourth_prcent = 0.29;
		final double fifth_percent = 0.33;

		double tax = 0;
		double weeklyPay;

		double incomecopy = this.salary;

		if (incomecopy >= fourth_bracket) {

			double difference_fourth = incomecopy - fourth_bracket;

			tax += difference_fourth * fifth_percent;

			incomecopy -= difference_fourth;

		}

		if (incomecopy >= third_bracket) {

			double difference_third = incomecopy - third_bracket;

			tax += difference_third * fourth_prcent;

			incomecopy -= difference_third;

		}

		if (incomecopy >= second_bracket) {
			double difference_second = incomecopy - second_bracket;
			tax += difference_second * third_percent;
			incomecopy -= difference_second;
		}

		if (incomecopy >= first_bracket) {
			double difference_first = incomecopy - first_bracket;
			tax += difference_first * second_percent;
			incomecopy -= difference_first;
		}

		if (incomecopy <= first_bracket) {
			double difference = incomecopy - 0;
			tax += difference * first_percent;
			incomecopy -= difference;
		}

		weeklyPay = (salary - tax) / 52;

		return Math.round(weeklyPay * 100.00) / 100.00;
	}

	// toString method for displaying employees information(name, number and salary)
	public String toString() {
		return "Name: " + this.name + "\nNumber: " + this.number + "\nSalary: $" + df.format(this.salary);
	}
}// HERE ENDS class Employees
