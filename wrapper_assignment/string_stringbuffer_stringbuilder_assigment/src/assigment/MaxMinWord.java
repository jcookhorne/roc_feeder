package assigment;

import java.util.Scanner;
import java.util.Arrays;
public class MaxMinWord {
//Take a sentence as input and print the word with maximum letters 
	//and also print the word with minimum letters.
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string input");
		String s = sc.nextLine();
		String s1[] = s.split(" ");
		String j  = "";
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<s1.length; i++) {
			 int size = s1[i].length();
			 int min, mx = 0;
			// System.out.println(size);
			 if (s1[i].isEmpty()){
				 System.out.println("You never entered any string");
			 }
			 while (sc.hasNext()) {
				 if (s1[i].length() > j.length()) {
					 j = s1[i];
			 }
			// System.out.println("testing" +Math.max(0, size));
			// sb.append(s1[i].length());	 
			// System.out.println(sb);
			// System.out.println("testing : " +Math.max(size, s1[i]));
			 }}}}			 
		
		

		//System.out.println(s1[0]);
		
	
