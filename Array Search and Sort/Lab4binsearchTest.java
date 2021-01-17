/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8130 311
 * Date of Submission: 11-10-2020
 */
package lab4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is main class that has Binarysearch class reference is used and it runs
 * all constructors, methods and variables of that class
 * 
 * @author Dhruv Bipin Patel
 *
 */
public class Lab4binsearchTest {

	public static void main(String[] args) {

		Binarysearch binarySearch = new Binarysearch();
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int[] localArray = null;

		do {
			try {
				System.out.println("Select your option in the menu below:");
				System.out.println("1. Initialize and populate an array of 20 random integers.");
				System.out.println("2. Perform a recursive binary search.");
				System.out.println("3. Perform a non-recursive binary search.");
				System.out.println("4. Sort the array - Go to submenu");
				System.out.println("5. Exit.");
				System.out.print(">");
				choice = input.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Wrong Input! Please select a number from the given option.");
				input.next();
			}

			switch (choice) {

			case 1:
				System.out.println("Array of randomly generated integers:");
				localArray = binarySearch.generateRandomInts();
				System.out.println(Arrays.toString(localArray));
				break;

			case 2:
				boolean local = false;
				do {
					try {
						System.out.print("Please enter an integer value to search:");
						int search = input.nextInt();
						long startTime = System.nanoTime();
						int found = binarySearch.recursiveBinarySearch(localArray, 0, localArray.length - 1, search);
						System.out.println(binarySearch.toString());
						long endTime = System.nanoTime();
						long meanTime = endTime - startTime;
						System.out.println("Time taken in nano seconds: " + meanTime);
						System.out.println("Time taken in milli seconds: " + meanTime / 1000000);
						if (found != -1) {
							System.out.println(
									search + " was found at index position " + found + ": recursive Binary Search");
							local = false;
						} else {
							throw new InputMismatchException();
						}
					} catch (InputMismatchException ex) {
						System.err.println("Wrong Input! Please select a number from the given option.");
//						input.next();
						local = true;
					}
				} while (local == true);

				break;

			case 3:
				boolean localVariable = false;
				do {
					try {
						System.out.print("Please enter an integer value to search:");
						int search = input.nextInt();
						int found = binarySearch.nonRecursiveBinarySearch(localArray, search);
						System.out.println(binarySearch.toString());
						if (found != -1) {
							long startTime = System.nanoTime();
							System.out.println(
									search + " was found at index position " + found + ": Iterative Binary Search");
							long endTime = System.nanoTime();
							long meanTime = endTime - startTime;
							System.out.println("Time taken in nano seconds: " + meanTime);
							System.out.println("Time taken in milli seconds: " + meanTime / 1000000);
							localVariable = false;
						} else {
							throw new InputMismatchException();
						}
					} catch (InputMismatchException ex) {
						System.err.println("Wrong Input! Please select a number from the given option.");
//						input.next();
						localVariable = true;
					}
				} while (localVariable == true);
				break;

			case 4:
				char sortChoice;
				do {
					System.out.println("Select a sorting algorithm to sort the data array");
					System.out.println("	B. Bubble Sort");
					System.out.println("	I. Insertion Sort");
					System.out.println("	S. Selection Sort");
					System.out.println("	M. Merge Sort");
					System.out.println("	Q. Quick Sort");
					System.out.println();
					System.out.println("	R. Return to Main Menu");
					System.out.print(">");
					String choose = input.next();
					sortChoice = choose.charAt(0);

					if (sortChoice == 'B' || sortChoice == 'b') {
//						System.out.println(binarySearch.toString());
						System.out.println("Bubble Sort: Simple sorting algorithm - O(n2) Complexity");
						long startTime = System.nanoTime();
						binarySearch.bubbleSort();
						long endTime = System.nanoTime();
						long meanTime = endTime - startTime;
						System.out.println("Time taken in nano seconds: " + meanTime);
						System.out.println("Time taken in milli seconds: " + meanTime / 1000000);
					} else if (sortChoice == 'I' || sortChoice == 'i') {
//						System.out.println(binarySearch.toString());
						System.out.println("Insertion Sort: Simple sorting algorithm - O(n2) Complexity");
						long startTime = System.nanoTime();
						binarySearch.insertionSort();
						long endTime = System.nanoTime();
						long meanTime = endTime - startTime;
						System.out.println("Time taken in nano seconds: " + meanTime);
						System.out.println("Time taken in milli seconds: " + meanTime / 1000000);
					} else if (sortChoice == 'S' || sortChoice == 's') {
//						System.out.println(binarySearch.toString());
						System.out.println("Selection Sort: Simple sorting algorithm - O(n2) Complexity");
						long startTime = System.nanoTime();
						binarySearch.selectionSort();
						long endTime = System.nanoTime();
						long meanTime = endTime - startTime;
						System.out.println("Time taken in nano seconds: " + meanTime);
						System.out.println("Time taken in milli seconds: " + meanTime / 1000000);
					} else if (sortChoice == 'M' || sortChoice == 'm') {
//						System.out.println(binarySearch.toString());
						System.out.println("Merge Sort: Simple sorting algorithm - O(n2) Complexity");
						long startTime = System.nanoTime();
						binarySearch.mergeSortMain(binarySearch.mergeSort, 0, binarySearch.mergeSort.length - 1);
						binarySearch.mergeSortPrint(binarySearch.mergeSort);
						long endTime = System.nanoTime();
						long meanTime = endTime - startTime;
						System.out.println("Time taken in nano seconds: " + meanTime);
						System.out.println("Time taken in milli seconds: " + meanTime / 1000000);
					} else if (sortChoice == 'Q' || sortChoice == 'q') {
//						System.out.println(binarySearch.toString());
						System.out.println("Merge Sort: Simple sorting algorithm - O(n2) Complexity");
						long startTime = System.nanoTime();
						binarySearch.quickSortMain(binarySearch.quickSort, 0, binarySearch.quickSort.length - 1);
						binarySearch.quickSortArrayPrint(binarySearch.quickSort);
						long endTime = System.nanoTime();
						long meanTime = endTime - startTime;
						System.out.println("Time taken in nano seconds: " + meanTime);
						System.out.println("Time taken in milli seconds: " + meanTime / 1000000);
					} else if(sortChoice == 'R') {
						System.out.println("Returning to main menu...");
					}
				} while (sortChoice != 'R' || sortChoice == 'r');
				break;

			case 5:
				System.out.println("Exiting…");
				break;

			}

		} while (choice != 5);

	}
}
