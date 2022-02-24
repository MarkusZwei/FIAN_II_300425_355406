package demo06_reflection;

public class Person {
	public String firstName;
	private String lastName;
	public int age;
	
	public Person(String firstName , String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private void meinePrivateMethode(String s) {
		System.out.println("Hier kommt keiner ran " + s);
	}
}
