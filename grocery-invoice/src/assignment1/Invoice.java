/*
 * Name: Dhruv Bipin Patel
 * Student Number: 040997897
 * Course: CST8110
 * Semester: W20
 * Assignment 1
 * Due Date: February 21, 2020, 11:59pm
 */

package assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * This application implements a basic invoice generating system for a
 * small business.
 */

public class Invoice {

	//Initialized variables as per given in the assignment 1 UML.
	private String productDescription;
	private double unitPrice;
	private int quantityPurchased;
	static private int invoiceNumber = 100;
	private static final int HST = 13;
	
	//Initialize variables as per calculation.
	private double price;
	private double totaltax;
	private double tax;
	
	//Default Constructor.
	public Invoice() {
		
		productDescription = "unknown";
		unitPrice = 0.0;
		quantityPurchased = 0;
		
		invoiceNumber++;
		
	}
	
	//Parameterized Constructor.
	public Invoice(String productDescription, double unitPrice, int quantityPurchased) {
		
		this.productDescription = productDescription;
		this.unitPrice = unitPrice;
		this.quantityPurchased = quantityPurchased;
		
		invoiceNumber++;
		
	}
	
	/*
	 * keywordInvoice method is used to input data and also the only method
	 * that has Scanner.
	 */
	public void keywordInvoiceInfo() {
		
		System.out.println("Invoice Number: " +invoiceNumber);
		
		
		//Initializing the only constructor in entire assignment
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Product Description: ");
		productDescription = scan.nextLine();
		
		System.out.print("Enter Unit Price: $");
		unitPrice = scan.nextDouble();
		
		System.out.print("Enter Quantity: ");
		quantityPurchased = scan.nextInt();
		
		scan.close();
	}
	
	//calculateTax method is used to calculate tax and total prize
	public double calculateTax() {
		
		price = unitPrice * quantityPurchased;
		tax = HST * price/100;
		totaltax = price + tax;
		
		return tax;
	}
	
	/*
	 * displayInvoice method is used to display entire information that is
	 * been generated in class
	 */
	public void displayInvoice() {

		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Valley Gardens Retail Outlet");
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		System.out.println("");
		System.out.println("Invoice Number: " +invoiceNumber);
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("%-25s %-20s %-20s \n","Product Description" , "Quantity" , "Unit Price");
		System.out.printf("%-25s %-20d %-20s \n",productDescription,quantityPurchased ,df.format(unitPrice));
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("%50s%5s\n\n","Subtotal $" ,df.format(price));
		System.out.printf("%50s%5s\n","HST 13.000% $" ,df.format(tax));
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("%50s%6s\n", "Total: $", df.format(totaltax));
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.println("Thank you for shopping at Valley Gardens Retail Outlet");
		System.out.println("");
			
	}
	
	
}
