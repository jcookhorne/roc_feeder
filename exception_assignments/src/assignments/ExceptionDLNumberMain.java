package assignments;

import java.util.Scanner;

public class ExceptionDLNumberMain {
	public static void main(String[] args) {
		// was running into this issue for the last program might as well use it here
		//3)Create a BusinessException(unchecked) and use it for handling for invalid DL number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Drivers License number");
		int n = sc.nextInt();
		System.out.println("Printing the Drivers number" + n);
		
		
		
		try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[11] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
	   }
		
		
		
	}

