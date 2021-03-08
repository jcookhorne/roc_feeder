package assignments;

import java.util.Scanner;

public class ValidationForPassport {

	public static void main(String[] args) {

		// Assingment - write validation for passport number ssn, number dl and any
		// other ID if you have
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter passport id");
		String P = sc.nextLine();
		if (P.matches("[A-Z]{2}[0-9]{8}")) {
			System.out.println("Validated");
		} else {
			System.out.println(" not Validated");
		}
		System.out.println("Please enter Drivers License 9 digits");
		String D = sc.nextLine();
		if (D.matches("[0-9]{8,12}")) {
			System.out.println("Validated");
		} else {
			System.out.println("not Validated");
		}
		System.out.println("Please enter Verification code");
		String V = sc.nextLine();
		if (V.matches("[0-9]{3}-[0-9]{3}")) {
			System.out.println("Validated");
		} else {
			System.out.println("Not Validate");
		}
	}
}
