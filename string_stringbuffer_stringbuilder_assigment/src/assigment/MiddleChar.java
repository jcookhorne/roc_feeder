package assigment;

import java.util.Scanner;

public class MiddleChar {
	public static void main(String[] args) {
		// 2)Take a sentence as input and for the word with length odd
		// convert the middle character to uppercase and for the word length even
		// convert the
		// first character to uppercase.

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string input");
		String s = sc.nextLine();
		String s1[] = s.split(" ");// splitting the input up for array use int for loop
		StringBuilder sb = new StringBuilder(); // adding string builder to append

		for (int i = 0; i < s1.length; i++) {
			if (s1[i].length() % 2 == 0) { // finding even
				sb.append(Character.toUpperCase(s1[i].charAt(0))).append(s1[i].substring(1)).append(" "); // upper casing first letter and subbing out the old first letter
			}
			if (s1[i].length() % 2 == 1) { // finding odd length words
				int mid = s1[i].length() / 2; // singling out middle character
				sb.append(s1[i].substring(0, mid));// only grabbing letters from beginning up to middle length letter
				sb.append(Character.toUpperCase(s1[i].charAt(mid))); // grabbing and upper casing middle letter
				sb.append(s1[i].substring(mid + 1)).append(" "); // only grabbing everything after it
			}

		}
		System.out.println(sb);
	}
}
