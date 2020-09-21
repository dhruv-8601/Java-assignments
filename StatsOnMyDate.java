import java.util.Calendar;
import java.util.Scanner;

public class Lab5R {

	public static void main(String[] args) {

		// Declaring scanner for input
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a valid date [DDMMYYYY]: ");
		// only variable for input of date
		String date = input.next();

		// variable that represent first and second word for day
		int  day = Integer.parseInt(date.substring(0, 2));
		// variable that represent third and fourth word for month
		int  month = Integer.parseInt(date.substring(2, 4));
		// variable that represent rest four words for year
		int year = Integer.parseInt(date.substring(4, 8));

		// declaring calendar constructor for getting input time and millisecond
		Calendar c = Calendar.getInstance();

		// declaring variable for millisecond digit counter
		long digit, large = 0, small = 10;
		
		//declaring finalMonth variable
		//here we are subtracting from 1 because in calendar month starts from 0
		int finalMonth = month - 1;
		
		//declaring variable for milliSecond digit average
		long count = 0,cont = 0;
		
		//using set method for setting day month and year
		c.set(year, finalMonth, day);
		
		//declaring counter variable for counting digits of milliSecond
		int counter = 0;
		
		//declaring milliSecond variable for getting milliSecond
		long milliSecond = c.getTimeInMillis();
		
		System.out.println(milliSecond);
		System.out.println(c.getTime());
		System.out.println("Time in milliseconds is : " +milliSecond);

		//loop for counting milliSecond digits
		for (; milliSecond != 0; counter++) {
			milliSecond /= 10;
		}

		//initializing milliSecond variable for second time to use the value for next loop 
		milliSecond = c.getTimeInMillis();

		System.out.println("Number of digits: " + counter);

		//loop for adding digits of milliSecond
		while (milliSecond != 0) {
			milliSecond /= 10;
			count = milliSecond % 10;
			cont += count;
		}
		//declaring variable for taking average of milloSecond digits
		long div = cont / counter;
		System.out.println("Average: " + div);

		//initializing milliSecond variable for second time to use the value for next loop
		milliSecond = c.getTimeInMillis();

		//loop for maximum and minimum digits of milliSecond digits
		for (; milliSecond > 0;) {
			digit = milliSecond % 10;
			if (digit > large) {
				large = digit;
			}
			if (digit < small) {
				small = digit;
			} else if (digit == 0) {
				small = 0;
			}
			milliSecond /= 10;
		}

		System.out.println("Max Digit: " + large);
		System.out.println("Min Digit: " + small);
		
		input.close();

	}
}
