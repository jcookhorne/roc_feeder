package day_2;

public class PalindromeNumbers {

	// 2) print all the palindrome numbers between 100 and 999
	public static void main(String[] args) {
		int x=100;
		for (int i = 100; i <=999; i++) {
			if(i/x==i%10) {
				System.out.println(i+"");
			}
			}
		}

	}

		
		


