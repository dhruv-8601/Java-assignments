/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Section: CST8130 311
 * Date of Submission: 11-10-2020
 */
package lab4;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is use to create and initialize array. Also, the main purpose of
 * this class is to search using two different binary search
 * 
 * @author Dhruv Bipin Patel
 * 
 */
public class Binarysearch {

	/**
	 * Creating reference of array with reference name refer to as "array"
	 */
	private int[] array = new int[20];
	private int[] binarySearchCopy = array;
	private int[] bubbleSortCopy = array;
	private int[] insertionSort = array;
	private int[] selectionSort = array;
	int[] mergeSort = array;
	int[] quickSort = array;

	/**
	 * Creating scanner class reference
	 */
	private Scanner input = new Scanner(System.in);

	/**
	 * This method search number from array using non-recursive binary search
	 * 
	 * @param Array  Integer array that stores number in sorted format
	 * @param Search This parameter is use to input number that user want to input
	 * @return Method returns index number if the search number matches the value
	 *         inside array otherwise will return -1 if it is not find
	 */
	protected int nonRecursiveBinarySearch(int[] a, int search) {

		Arrays.sort(binarySearchCopy);
		this.binarySearchCopy = a;
		int lowest = 0;
		int highest = a.length - 1;
		int middle = (lowest + highest + 1) / 2;
		int index = -1;

		for (int count = 0; count < a.length; count++) {
			if (search == a[count]) {

				do {
					if (search == a[middle]) {
						index = middle;
					} else if (search < a[middle]) {
						highest = middle - 1;
					} else if (search > a[middle]) {
						lowest = middle + 1;
					}

					middle = (lowest + highest + 1) / 2;

				} while (lowest <= highest && index == -1);
			}
		}

		return index;
	}

	/**
	 * This method search number from array using recursive binary search
	 * 
	 * @param Array  Integer array that stores number in sorted format
	 * @param First  This parameter indicates starting element of array
	 * @param Last   This parameter indicates ending or last element of array
	 * @param Search This parameter is use to input number that user want to input
	 * @return Method returns index number if the search number matches the value
	 *         inside array otherwise will return -1 if it is not find
	 */
	protected int recursiveBinarySearch(int[] a, int first, int last, int search) {

		Arrays.sort(binarySearchCopy);
		int middle = (first + last + 1) / 2;

		if (last < first) {
			return -1;
		} else if (search < a[middle]) {
			return recursiveBinarySearch(a, first, middle - 1, search);
		} else if (search > a[middle]) {
			return recursiveBinarySearch(a, middle + 1, last, search);
		} else if (search == a[middle]) {
			return middle;
		}
		return -1;
	}

	/**
	 * This method generate random number and sort the array values so that values
	 * can be search using binary search
	 * 
	 * @return Method returns entire array elements and their values
	 */
	protected int[] generateRandomInts() {
		for (int count = 0; count < array.length; count++) {
			SecureRandom random = new SecureRandom();
			int range = 10 + random.nextInt(90);
			array[count] = range;
		}
		return array;
	}

	/**
	 * This method is used to sort the array using bubble sort
	 */
	protected void bubbleSort() {

		for (int x = 0; x < bubbleSortCopy.length; x++) {
			for (int y = 0; y < bubbleSortCopy.length - x - 1; y++) {
				if (bubbleSortCopy[y] > bubbleSortCopy[y + 1]) {
					int copy = bubbleSortCopy[y];
					bubbleSortCopy[y] = bubbleSortCopy[y + 1];
					bubbleSortCopy[y + 1] = copy;
				}
			}
		}
		System.out.println(Arrays.toString(bubbleSortCopy));
	}

	/**
	 * This method is used to sort the array using insertion sort
	 */
	protected void insertionSort() {
		for (int x = 0; x < insertionSort.length - 1; x++) {
			int c = x;
			int y = x + 1;
			while (x >= 0 && insertionSort[x] > insertionSort[y]) {
				int copy = insertionSort[x];
				insertionSort[x] = insertionSort[y];
				insertionSort[y] = copy;
				y--;
				x--;
			}

			x = c;
		}
		System.out.println(Arrays.toString(insertionSort));
	}

	/**
	 * This method is used to sort the array using selection sort
	 */
	protected void selectionSort() {
		for (int x = 0; x < selectionSort.length - 1; x++) {
			int value = x;
			int temp = x;
			int y = x + 1;
			while (x < selectionSort.length - 1 || selectionSort[temp] > selectionSort[y]) {
				if (selectionSort[temp] > selectionSort[y]) {
					temp = y;
				}
				x++;
				if (y < selectionSort.length - 1)
					y++;
			}
			x = value;
			int copy = selectionSort[temp];
			selectionSort[temp] = selectionSort[x];
			selectionSort[x] = copy;

		}
		System.out.println(Arrays.toString(selectionSort));
	}

	/**
	 * This method is used to sub divid array into single array index
	 * 
	 * @param mergeSort Copy of main array
	 * @param first     First array index
	 * @param middle    Middle array index
	 * @param last      Last array index
	 */
	protected void mergeSort(int mergeSort[], int first, int middle, int last) {
		int x = middle - first + 1;
		int y = last - middle;

		int leftArray[] = new int[x];
		int rightArray[] = new int[y];

		for (int count1 = 0; count1 < x; ++count1)
			leftArray[count1] = mergeSort[first + count1];
		for (int count2 = 0; count2 < y; ++count2)
			rightArray[count2] = mergeSort[middle + 1 + count2];

		int count1 = 0, count2 = 0;

		int temp = first;
		while (count1 < x && count2 < y) {
			if (leftArray[count1] <= rightArray[count2]) {
				mergeSort[temp] = leftArray[count1];
				count1++;
			} else {
				mergeSort[temp] = rightArray[count2];
				count2++;
			}
			temp++;
		}

		while (count1 < x) {
			mergeSort[temp] = leftArray[count1];
			count1++;
			temp++;
		}

		while (count2 < y) {
			mergeSort[temp] = rightArray[count2];
			count2++;
			temp++;
		}
	}

	/**
	 * This method is used to sort the array using merge sort
	 * 
	 * @param mergeSort Copy of main array
	 * @param first     First index of array
	 * @param last      Last index of array
	 */
	protected void mergeSortMain(int mergeSort[], int first, int last) {
		if (first < last) {
			int m = (first + last) / 2;

			mergeSortMain(mergeSort, first, m);
			mergeSortMain(mergeSort, m + 1, last);

			mergeSort(mergeSort, first, m, last);
		}
	}

	/**
	 * This method is used to print sorted array using merge sort
	 * 
	 * @param mergeSort Copy of main array
	 */
	protected void mergeSortPrint(int mergeSort[]) {
		this.mergeSort = mergeSort;
		System.out.println(Arrays.toString(mergeSort));
	}

	/**
	 * This method is used to sub divid array into subdivision array
	 * 
	 * @param quickSort copy of main array
	 * @param left      First array index
	 * @param right     Last array index
	 * @return
	 */
	protected int quickSort(int quickSort[], int left, int right) {
		int specialPoint = quickSort[right];
		int x = (left - 1);
		for (int y = left; y < right; y++) {
			if (quickSort[y] < specialPoint) {
				x++;

				int temp = quickSort[x];
				quickSort[x] = quickSort[y];
				quickSort[y] = temp;
			}
		}

		int temp = quickSort[x + 1];
		quickSort[x + 1] = quickSort[right];
		quickSort[right] = temp;

		return x + 1;
	}

	/**
	 * This method is used to sort the array using quick sort
	 * 
	 * @param quickSort Copy of original array
	 * @param left      First array index
	 * @param right     Last array index
	 */
	protected void quickSortMain(int quickSort[], int left, int right) {
		if (left < right) {

			int pi = quickSort(quickSort, left, right);

			quickSortMain(quickSort, left, pi - 1);
			quickSortMain(quickSort, pi + 1, right);
		}
	}

	/**
	 * This method is used to print sorted array using quick sort
	 * 
	 * @param quickSort Copy of main array
	 */
	protected static void quickSortArrayPrint(int quickSort[]) {
		int n = quickSort.length;
		for (int i = 0; i < n; ++i)
			System.out.print(quickSort[i] + " ");
		System.out.println();
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
