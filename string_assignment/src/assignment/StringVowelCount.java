package assignment;


import java.util.Scanner;

public class StringVowelCount {
	public static void main(String[] args) {
	//	 * 1)Take a string input 
//from user and find the count of vowels(aeiouAEIOU) in it
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string input");
		String s = sc.nextLine();
		System.out.println(s.replaceAll("[^aeiouAEIOU]", "").length());

		}


		
	}
