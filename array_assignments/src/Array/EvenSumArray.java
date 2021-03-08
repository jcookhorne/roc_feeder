package Array;

import java.util.Scanner;

public class EvenSumArray {

	// take and array input and find the sum of all even numbers
	public static void main(String[] args) {
		int evensum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Printing sum even numbers");
		for (int i1 = 0; i1 < ar.length; i1++) {
			if (ar[i1] % 2 == 0) {
				evensum += ar[i1];

			}

		}
		System.out.println(evensum);
	}
}
