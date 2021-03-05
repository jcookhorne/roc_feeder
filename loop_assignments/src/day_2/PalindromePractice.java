package day_2;

import java.util.Scanner;

public class PalindromePractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first 3 digit number for palindrome beginning value");
		int firNum = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the second 3 digit number for palindrome end value.");
		int secNum = Integer.parseInt(sc.nextLine());
		int x = 100;
		if (firNum <= 99 && firNum >= 1000) {
			System.out.println("The first number you have selected is not correct please enter a 3 digit number");
		}
		if (secNum <= 99 && secNum >= 1000) {
				System.out.println("The Second number you have selected is not correct please enter a 3 digit number");
			} 

				for (int i = firNum; i <= secNum; i++) {

					if (i / x == i % 10) {
						System.out.println(i + "");
					}
				}
			}
		}
	
