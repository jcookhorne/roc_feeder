package eg;

import pack1.MethodDemo;

public class CalculatorMain {

	public static void main(String [] args) {
	System.out.println(Calculator.multiply(10, 30));
	MethodDemo.myMethod();
	MethodDemo.helloByName("Joshua");
	
	Calculator c= new Calculator();
	System.out.println(c.add(100, 2222));
	
	System.out.println(c.add(12.333f, 1.22f));
	System.out.println(c.add("hey, hi", null));
	System.out.println(c.add(22,22,11));
	
	}
}
