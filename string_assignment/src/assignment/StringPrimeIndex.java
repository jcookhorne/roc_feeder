package assignment;

import java.util.Scanner;


public class StringPrimeIndex {

	public static void main(String[] args) {
		// Take a string input from user and find the count of vowels(aeiouAEIOU) in it.
//		System.out.println("System will now find the count of vowels in Input");
		// 3)Take a string input and print the characters at prime index to uppercase.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string input");
		String s = sc.nextLine();
		String s1[] = s.split("");

		System.out.println("Printing only prime numbers uppercase");
		for (int i = 0; i < s.length(); i++) {
			if (isPrime(i)) {
				System.out.println(s1[i].toUpperCase());
			}

		}

	}

	public static boolean isPrime(int j) {
		int c = 0;
		for (int i = 1; i <= j; i++) {
			if (j % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;

		} else {
			return false;
		}

	}

}
