package assignments;

import java.util.Scanner;

public class ExceptionDL {
	public static void main(String[] args) {
		// was running into this issue for the last program might as well use it here
		// 3)Create a BusinessException(unchecked) and use it for handling for invalid
		// DL number.
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter your 9 digit Drivers License number");
			String n = sc.nextLine();
			System.out.println("Printing the Drivers number : " + n);
			if (n.length() <= 9 || n.length() >= 9) {
				String small = n.substring(0, 9);
				System.out.println("your Drivers license number is accepted : " + small);
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("your DL has the incorrect amount of numbers please re-enter");
		}
	}
}
