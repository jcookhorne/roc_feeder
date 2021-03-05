package assignment;




public class EmployeeMain {

	public static void main(String[] args)
	{
	Employee e = new Employee(140, "Joshua", "jncookhorne@gmail.com", 24);
	System.out.println(e);
	System.out.println("Person Address");
	Address a = new Address(1002, " Orange Blvd", "Miami", "FL", 25873);
	System.out.println(a);
	Address a1 = new Address(2524, " Sugar Creek", "Charlotte","NC", 28278);
	System.out.println(a1);
	Project p = new Project(589, "Project:  The End", "Client: Nick");
	System.out.println(p);
	
	
	
	}
}
