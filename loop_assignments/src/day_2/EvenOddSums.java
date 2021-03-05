package day_2;

public class EvenOddSums {

	public static void main(String[] args) {

		// Assigment
		/*
		 * 1) try all the loop by yourself with some case of your own 2) print all the
		 * palindrome numbers between 100 and 999 3 ) find all the odd numbers between
		 * 100 and 199 4) find the sum of all even numbers between 1 and 100 also find
		 * the sum of all odd numbers between1 and 100 and print the results and print
		 * which is the largest among them (between even sum and odd sum)
		 */
		System.out.println("even numbers between 1 and 100");
		int oddsum = 0;
		int evensum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				 evensum+=i;
				
			}
		}
		System.out.println("The sum of the even numbers is :"+evensum);
		int j;
		for (j = 1; j <= 100; j++) {
			if (j % 2 != 0) {
					oddsum+=j;
			}
		}
		System.out.println("The sum of the odd numbers is :" +oddsum);
		System.out.println("The Largest among the sums is : " +evensum);
	}
}

