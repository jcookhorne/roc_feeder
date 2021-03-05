package Array;

import java.util.Scanner;
import java.util.Arrays;

public class PrimeArray {

	// .take an array input and find all the prime numbers from it

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();// creating the array that what i is for

		}System.out.println("printing all the prime numbers");
		for (int i1 = 0; i1 < ar.length; i1++) {// variable change from before but we called on the length
			if (isPrime(ar[i1])) {// calling on new variable and the array from before
				System.out.println(ar[i1] + "");// printing them to get the results of what was put in
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
