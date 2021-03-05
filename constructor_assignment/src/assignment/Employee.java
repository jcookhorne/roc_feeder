package assignment;

public class Employee {

	private int id;
	private String name;
	private String email;
	private int age; // these will be e
	private Address personAddress; // this will be e2
	private Address permanentAddress; // this will be e3
	private Project projectid;
	private Project projectname;
	private Project clientname;// these will be e4



	public Employee(int id, String name, String email, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public Employee(int id, String name, String email, String string, int age, Address personAddress, Address permanentAddress) {
		this(id,name,string,age);
		this.personAddress = personAddress;
		this.permanentAddress = permanentAddress;
		
	}
	public Employee(int id, String name, String email, String string, int age, Address personAddress, Address permanentAddress, Project projectid, Project projectname, Project clientname) {
		this(id, name ,string, age);
		this.projectid = projectid;
		this.projectname = projectname;
		this.clientname = clientname;
	}
	

	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", email = " + email + ", age = " + age + ", personAddress = "
				+ personAddress + ", permanentAddress = " + permanentAddress + ", projectid = " + projectid
				+ ", projectname = " + projectname + ", clientname = " + clientname + "]";
	}}
