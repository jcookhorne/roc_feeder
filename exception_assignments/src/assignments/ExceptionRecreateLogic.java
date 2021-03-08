package assignments;


public class ExceptionRecreateLogic {
	public boolean isValidAge(int age) throws ExceptionRecreateInvalid {
		
		if(age<=0) {
			throw new ExceptionRecreateInvalid("Age cannot be zero or -ve");
		}
		
		if(age<21) {
			throw new ExceptionRecreateInvalid("You must be 21 or older ");
		}
		
		return true;
	}
	
	/*
	public boolean isBirthValid(String birth) throws ExceptionRecreateInvalid{
		if(!birth.matches("[0-9]{2}[0-9]{2}")) {
			throw new ExceptionRecreateInvalid("Entered birthday "+birth+" is invalid");
		}
		
		return true;
	} */

}

