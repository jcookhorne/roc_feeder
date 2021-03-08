package assignment;

import java.util.Scanner;
import java.util.Arrays;

public class StringVowelCheck {

	public static void main(String[] args) {
		char ch;
		int v = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string input");
		String s = sc.nextLine();
		System.out.println("Checking for Vowels in your string");
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(v);
			switch (ch) {
			case 'a': case 'e':case 'i':case 'o':case 'u':
			case 'A':case 'E':case 'I':case 'O':case 'U':
				v = 1;
			}
		}
		if (v == 1)
			System.out.println(true);
		else {
			System.out.println(false);
		}

	}

}
