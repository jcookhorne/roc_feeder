package assignments;

import java.util.Scanner;

public class ValidationForNumbers {

	public static void main(String[] args) {

		// Assingment - write validation for passport number ssn, number dl and any
		// other ID if you have

		/*
		 * 3uppercase letters followed by - and 4 digits
		 */

		String s = "ZR0001939XXB8501019F1801145<<<<<<<<<<<<<<<<<<<";

		System.out.println(s.replaceAll("[^A-Z]", "").length());
		System.out.println(s.replaceAll("[^0-9]", "").length());
		if (s.matches("[A-Z0-9]*[<]*")) {
			System.out.println("Validated");
		} else {
			System.out.println("Invalid");
			//
		}

		// String s1 = new String s1 ("104-55-8539");

	}
}

//6 letters upppercase
// 0001939501019