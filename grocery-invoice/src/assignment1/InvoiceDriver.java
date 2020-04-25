package assignment1;

public class InvoiceDriver {

	public static void main(String[] args) {

		System.out.println("Updated File");
		
		//Initializing object for Default constructor.
		Invoice I1 = new Invoice();
		//Invoking displayInvoice method using default constructor reference.
		I1.displayInvoice();
		
		
		//Initializing object for Parameterized constructor.
		Invoice I2 = new Invoice("Tomato Seeds", 7.95, 4);
		//Invoking claculateTax method using default constructor reference.
		I2.calculateTax();
		//Invoking displayInvoice method using Parameterized constructor reference.
		I2.displayInvoice();
		
		//Initializing object for Default constructor.
		Invoice I3 = new Invoice();
		//Invoking keyboardInvoiceInfo method using default constructor reference.
		I3.keywordInvoiceInfo();
		//Invoking claculateTax method using default constructor reference.
		I3.calculateTax();
		//Invoking displayInvoice method using default constructor reference.
		I3.displayInvoice();
	}
}
