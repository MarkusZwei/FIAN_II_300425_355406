package pak01equals;

public class Person {
	String name;
	int alter;
	
	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		//Reflexive
		if(this == obj) {
			return true;
		}
		if(obj instanceof Person other) {
			if(this.name.equals(other.name)&&this.alter==other.alter) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.alter;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", alter=" + alter + "]";
	}
	
	
}
