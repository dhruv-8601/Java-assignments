/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8132 302
 * Date of Submission: 15-07-2020 10:30AM
 */
package lab6;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
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
	 * studentCount variable to keep count of students for reference array
	 */
	private static int studentCount = 0;

	/**
	 * initialize Student class reference array
	 */
	Student[] students;

	/**
	 * parameterized constructor
	 * 
	 * @param name - to pass object of college name
	 * @param num  - to initialize reference array size
	 */
	public College(String name, int num) {
		this.name = name;
		students = new Student[num];
	}

	/**
	 * printTitle method to display college name at the top of the list
	 */
	public void printTitle() {
		if (studentCount == 0) {
			System.out.println("No students to display.... ");
		} else {
			System.out.println(name + " - List of Students");
			System.out.println("*************************************");
			System.out.printf("%-15s| %-15s| %-15s| %-20s| %-10s| %-5s| %-8s| %-8s| %n", "Program", "Student#", "Name",
					"Email", "Phone", "GPA", "Fees", "Credits");
		}
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
		if (studentCount == students.length) {
			System.out.println("Array is full...... cannot add more students");
			return -1;
		}
		System.out.println("Enter details of student " + (studentCount + 1));
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
				students[studentCount] = new FulltimeStudent();
			} else if (choice == 2) {
				students[studentCount] = new ParttimeStudent();
			} else {
				System.out.println("Wrong student type");
			}
		} while (choice != 1 && choice != 2);

		students[studentCount].readInfo(input);
		studentCount++;

		return students.length;
	}

	/**
	 * printStudentDetails to display each student information one-by-one from array
	 */
	public void printStudentDetails() {
		for (int count = 0; count < studentCount; count++) {
			students[count].printInfo();
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
		if (studentCount == students.length) {
			System.out.println("Array is full...... cannot add more students");
			return -1;
		}
		try {
			input = new Scanner(Paths.get("Lab6/lab6/students.txt"));

		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		while (input.hasNext()) {
			char type = input.next().charAt(0);
			if (type == 'f') {
				students[studentCount] = new FulltimeStudent();
			} else if (type == 'p') {
				students[studentCount] = new ParttimeStudent();
			}

			students[studentCount].readFile(input);
			studentCount++;
		}

		if (studentCount == students.length) {
			return -1;
		} else {
			return studentCount;
		}
	}

}
