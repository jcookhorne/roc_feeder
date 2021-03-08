package assignments;

import java.util.Scanner;

public class ExceptionRecreateMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int x=100;
//		x=10;

		ExceptionRecreateLogic r = new ExceptionRecreateLogic();
		try {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your age");
			int age = sc.nextInt();
			System.out.println("Age : " + age);
			if (r.isValidAge(age)) {
				System.out.println("Age validated");
			}
		} catch (ExceptionRecreateInvalid e) {
			System.out.println(e.getMessage());
		}
	/*try {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your birthday");
		String birth = sc.nextLine();
		System.out.println("birthday : " + birth);
		if (r.isBirthValid(birth)) {
			System.out.println("Valid birthday");
		}
		}catch(ExceptionRecreateInvalid e) {
			System.out.println(e.getMessage());
		}*/

	}}