
/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Course: CST8110
 * Semister: W20
 * Assignment 2
 * Due Date: April 12, 2020, 11:59PM
 */
import java.util.Scanner;

// public class EmployeeDriver
// this method contains main method
public class EmployeeDriver {

	public static void main(String[] args) {

		// declaring final int variable for setting maximum index for array
		final int maxNumEmployees = 5;

		// arrayEmployeeCounter variable for counting index number of array to store
		// employee information
		int arrayEmployeeCounter = 0;

		// to count total weekly pay of all employees currently working
		double totalWeeklyPay = 0.0;
		// choice variable for user input to enter their choice
		int choice;

		Scanner input = new Scanner(System.in);

		// declaring and initializing object for employee class using array
		// and using maxNumEmployees varible for setting maximum index number
		Employee[] employee = new Employee[maxNumEmployees];

		/*
		 * For testing employee information, without entering every single employee
		 * information ( name, number, salary )
		 *
		 * If you want you can comment this below code till arrayEmployeeCounter =4 to
		 * enter employees from starting
		 */
		employee[0] = new Employee("Thanh Do", 123, 185000);
		employee[1] = new Employee("Jacklyn Jones", 174, 145000);
		employee[2] = new Employee("Rita Chan", 185, 72000);
		employee[3] = new Employee("Vikash Singh", 198, 300000);
		arrayEmployeeCounter = 4;

		// do/while loop for repeating application until user select to exit
		do {

			System.out.println("MAKE A SELECTION");
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. DISPLAY EMPLOYEES");
			System.out.println("3. DISPLAY PAYROLLS");
			System.out.println("4. QUIT");

			// declaring variables for adding information about employees
			String addName;
			int addNumber;
			double addSalary;

			choice = input.nextInt();

			// switch case for user to select their choice
			switch (choice) {

			// case 1 for adding informations of employees
			case 1:

				// if statement to check maximum number array can store information of employees
				if (arrayEmployeeCounter < maxNumEmployees) {

					System.out.print("Enter employee name: ");
					input.nextLine();
					addName = input.nextLine();

					System.out.print("Enter employee number: ");
					addNumber = input.nextInt();

					System.out.print("Enter employee salary: ");
					addSalary = input.nextDouble();

					employee[arrayEmployeeCounter] = new Employee(addName, addNumber, addSalary);
					arrayEmployeeCounter++;
					System.out.println();
				} else {
					System.err.println("Number of Employees is at the maximum");
					System.out.println();
				}

				break;

			// case 2 for displaying employees information( name, number and salary )
			case 2:
				if (arrayEmployeeCounter == 0) {
					System.err.println("There are no employees");
					System.out.println();
				} else {
					System.out.println("CURRENT EMPLOYEES");
					System.out.println();
					for (int displayCounter = 0; displayCounter < arrayEmployeeCounter; displayCounter++) {
						System.out.println(employee[displayCounter].toString());
						System.out.println();
					}
				}
				break;

			// case 3 for displaying employees payment details
			case 3:

				if (arrayEmployeeCounter == 0) {
					System.err.println("There are no employees");
					System.out.println();
				} else {
					System.out.println("EMPLOYEE NAME AND WEEKLY PAY");
					System.out.println();
					for (int paymentCounter = 0; paymentCounter < arrayEmployeeCounter; paymentCounter++) {
						if (employee[paymentCounter] != null) {
							System.out.println("Name: " + employee[paymentCounter].getName());
							System.out.printf("Weekly Pay: $%.2f" , employee[paymentCounter].calculateWeeklyPay());
							totalWeeklyPay += employee[paymentCounter].calculateWeeklyPay();
							System.out.println();
						}
					}

					System.out.println("Total Weekly Pay Role: $" + totalWeeklyPay);
					System.out.println();
				}
				break;
			// case 4 to exit from application
			case 4:
				System.out.println("Goodbye");
				break;

			}// HERE ENDS switch statement
		} while (choice != 4); // HERE ENDS do/while loop
	}// HERE ENDS main method
}// HERE ENDS Emplo
