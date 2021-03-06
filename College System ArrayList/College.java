/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 29-07-2020 10:30AM
 */
package lab8;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is use to collect all inheritance classes so that they can work
 * correctly and be ready to run in main class
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class College {

	/**
	 * name variable to store college name
	 */
	private String name;

	/**
	 * initialize Student class reference arrayList
	 */
	ArrayList<Student> students;

	Student s = null;

	/**
	 * parameterized constructor
	 * 
	 * @param name - to pass object of college name
	 * @param num  - to initialize reference array size
	 */
	public College(String name, int num) {
		this.name = name;
		students = new ArrayList<Student>();
	}

	/**
	 * printTitle method to display college name at the top of the list
	 */
	public void printTitle() {

		System.out.println(name + " - List of Students");
		System.out.println("*************************************");
		System.out.printf("%-15s| %-15s| %-15s| %-20s| %-10s| %-5s| %-8s| %-8s| %n", "Program", "Student#", "Name",
				"Email", "Phone", "GPA", "Fees", "Credits");
	}

	/**
	 * readStudentDetails to read each students deatil one-by-one student
	 * information inside the array
	 * 
	 * @param input - This is a Scanner object that is been passes inside
	 *              readStudentsDetails method
	 * @return - return -1 if array is full or else return number of student in
	 *         array
	 */
	public int readStudentsDetails(Scanner input) {

		System.out.println("Enter details of student ");
		System.out.println("===============================");

		int choice = 0;

		/**
		 * do/while loop to ask user to input again as the student type selection is not
		 * from the option given
		 */
		do {
			System.out.println("1 - Fulltime student");
			System.out.println("2 - Parttime student");
			System.out.println("Enter student type:");

			choice = input.nextInt();

			if (choice == 1) {
				s = new FulltimeStudent();
			} else if (choice == 2) {
				s = new ParttimeStudent();
			} else {
				System.out.println("Wrong student type");
			}
		} while (choice != 1 && choice != 2);

		s.readInfo(input);

		students.add(s);

		return students.size();
	}

	/**
	 * printStudentDetails to display each student information one-by-one from
	 * arrayList
	 */
	public void printStudentDetails() {
		for (int count = 0; count < students.size(); count++) {
			students.get(count).printInfo();
		}
	}

	/**
	 * method for input of file path which we use to get information from and use
	 * that inforamtion to differentiate information into part time and full time
	 * student category
	 * 
	 * @param input - This is a Scanner object that is been passes inside
	 *              readFromFile method
	 * 
	 * @return int - return -1 if array is full or else return number of student in
	 *         array
	 */
	public int readFromFile(Scanner input) {
		try {
			input = new Scanner(Paths.get("Lab6/lab6/students.txt"));

		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		while (input.hasNext()) {
			char type = input.next().charAt(0);
			if (type == 'f') {
				s = new FulltimeStudent();
			} else if (type == 'p') {
				s = new ParttimeStudent();
			}

			s.readFile(input);

			students.add(s);
		}

		return students.size();
	}

}
