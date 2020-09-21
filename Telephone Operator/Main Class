import java.util.Scanner;

public class TelephoneOperator {

	private void dialPhoneNumber(int SPN) {

		System.out.println("Dialing special number " + SPN + "...");

	}

	private void dialPhoneNumber(int NPA, int SN) {

		if (SN/1000000 != 0 && SN/1000000 != 1) {
			System.out.println("Dialing local phone number " + NPA + " " + String.valueOf(SN).substring(0, 3) +"-" +String.valueOf(SN).substring(3)+ "...");
		} else {
			System.out.println("Wrong local phone number entered !");
		}
	}
	
	private void dialPhoneNumber(int CC, int NPA, int SN) {
		
		if (SN/1000000 != 0 && SN/1000000 != 1 && CC ==1) {
			System.out.println("Dialing NA local phone number "+CC+ " " + NPA + " " + String.valueOf(SN).substring(0, 3) +"-" +String.valueOf(SN).substring(3)+ "...");
		} else {
			System.out.println("Wrong NA local phone number entered !");
		}
		
	}
	
	private void dialPhoneNumber(int AC, int CC, int MAC, int SN) {
		
		if(AC == 11) {
			
			System.out.println("Dialing overseas long distance phone number 0" +AC+ " " +CC+ " " +MAC+ "-" +SN+ "...");
		
		} else {
			System.out.println("Wrong overseas long distance phone number entered !");
		}
		
	}
	
	

	public static void main(String[] args) {

		TelephoneOperator tph = new TelephoneOperator();

		Scanner input = new Scanner(System.in);
		System.out.println("<Welcome message to the Telephone Operator program>");
		
		String phoneNumber;
		
		do {
		System.out.print("Please enter a telephone number or -1 to exit: ");
		phoneNumber = input.next();

		if (phoneNumber.length() == 3) {
			
			tph.dialPhoneNumber(Integer.valueOf(phoneNumber));
		
		} else if (phoneNumber.length() == 10) {

			String stringNPA = phoneNumber.substring(0, 3);
			int NPA = Integer.valueOf(stringNPA);
			
			String stringSN = phoneNumber.substring(3);
			int SN = Integer.valueOf(stringSN);
			
			tph.dialPhoneNumber(NPA, SN);
			
		} else if (phoneNumber.length() == 11) {
			
			String stringCC = phoneNumber.substring(0, 1);
			int CC = Integer.valueOf(stringCC);
			
			String stringNPA = phoneNumber.substring(1, 4);
			int NPA = Integer.valueOf(stringNPA);
			
			String stringSN = phoneNumber.substring(4);
			int SN = Integer.valueOf(stringSN);
			
			tph.dialPhoneNumber(CC, NPA, SN);
		} else if (phoneNumber.length() == 12) {
			
			String stringAC = phoneNumber.substring(0, 3);
			int AC = Integer.valueOf(stringAC);
			
			String stringCC = phoneNumber.substring(3, 6);
			int CC = Integer.valueOf(stringCC);
			
			String stringMAC = phoneNumber.substring(6, 8);
			int MAC = Integer.valueOf(stringMAC);
			
			String stringSN = phoneNumber.substring(8);
			int SN = Integer.valueOf(stringSN);
			
			tph.dialPhoneNumber(AC, CC, MAC, SN);
			
		}
		
		
		else {
			System.out.println("Wrong Number entered !");
		}
		}while(phoneNumber.charAt(0) != '-');

	}
}
