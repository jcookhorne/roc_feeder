package Array;

import java.util.Scanner;
import java.util.Arrays;
public class MaxMinArray {

	// 4)Take an array input and find the max value and min value from that array.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();	
		} // array asked for and created
		System.out.println("System will now find Min and Max numbers");
		for(int i1 = 0; i1<ar.length; i1++) {
			Arrays.sort(ar);
			//System.out.println(ar[i1]);	
		}
		int max = ar[ar.length - 1];
		System.out.println("MIN number : " + ar[0]);
		System.out.println("Max number : " + max);
	
	
	}
}
