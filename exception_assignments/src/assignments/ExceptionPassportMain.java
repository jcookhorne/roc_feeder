package assignments;

import java.util.Scanner;

public class ExceptionPassportMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int x=100;
//		x=10;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your 9 digit Passport number");
		String n = sc.nextLine();
		System.out.println("Printing the passport number : " + n);
		if (n.length() != 9) {
			throw new ExceptionPassport("Entered passport " + n + " is invalid");
		} else if (n.length() == 9) {
			String small = n.substring(0, 9);
			System.out.println("Passport is valid : " + small);
		} else {

		}
	}

}
