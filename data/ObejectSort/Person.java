package ObejectSort;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.print("Last name: "+lastName);
		System.out.print(",First name: "+firstName);
		System.out.println(",Age: "+age);
	}
	
	public String getLast() {
		return lastName;
	}
}
