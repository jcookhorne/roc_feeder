package Array;

import java.util.Scanner;

//take an array input and find all the palindrome numbers from it

public class PalindromeArray {
	public static void main(String[] args) {
		int rem, back = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		// array asked for and create
		System.out.print("The System will now check for palindrome numbers\n");
		for (int i1 = 0; i1 < ar.length; i1++) {
		int og = ar[i1];	
			while (ar[i1] != 0) {
				rem = ar[i1] % 10;
				back = (back * 10) + rem;
				ar[i1] = ar[i1] / 10;
			}
			
			if (og == back) {

				System.out.println("printing palindrome numbers " + back);
				back = 0;
			} else {
				break;

			}

		}
	}

}

// if(i/x==i%10)
