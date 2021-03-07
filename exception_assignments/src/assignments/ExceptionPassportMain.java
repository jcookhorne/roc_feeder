package assignments;

public class ExceptionPassportMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int x=100;
//		x=10;

		ValidatorLogic v = new ValidatorLogic();
		try {
			if (v.isValidAge(36)) {
				System.out.println("Age validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
		if (v.isValidMobileNumber("+1-12345678909")) {
			System.out.println("Valid number");
		}
		}catch(InvalidContactException e) {
			System.out.println(e.getMessage());
		}

	}
}
