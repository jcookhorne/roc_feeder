package assigment;

import java.util.Scanner;
import java.util.Arrays;

public class LastChar {
	public static void main(String[] args) {
		// 1)Take a sentence as input and convert
		// all the last chars to upper case of every word

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string input");
		String s = sc.nextLine();
		String s1[] = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			int last = s1[i].length() - 1;
			System.out.println(s1[i].toUpperCase().charAt(last));
		}
	}
}
