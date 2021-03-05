package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxArray {

	// Take an array input and find the 2nd max value in that array.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		} // array asked for and created

		System.out.println("System will now find the second Max numbers");
		for (int i1 = 0; i1 < ar.length; i1++) {
			Arrays.sort(ar);
		}
		int max = ar[ar.length - 2];
		System.out.println("the second Max : " + max);

	}
}
