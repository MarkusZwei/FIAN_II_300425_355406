package pak01equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Demo01Equals {
	public static void main(String[] args) {
		Person p01 = new Person("Markus", 45);
		Person p02 = new Person("Markus", 45);
		
		System.out.println(p01==p02); //false
		System.out.println(p01.equals(p02)); //false
		
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println(p02.hashCode());
		
		Set<Person>personen = new HashSet<>();
		
		personen.add(p01);
		personen.add(p02);
		
		System.out.println(personen);
		
		Object o = new A(1, "Eins");
		Object o1 = new B(1, 10);
		Set<Object> objSet = new HashSet<>();
		objSet.add(o);
		objSet.add(o1);
		
		System.out.println(objSet);
		
	}
}

class Parent{
	int id;
}
class A extends Parent{
	
	String name;
	
	public A(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		Parent other = (Parent) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}	
}

class B extends Parent{
	
	double preis;
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {		
		Parent other = (Parent) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "B [id=" + id + ", preis=" + preis + "]";
	}
	
	public B(int id, double preis) {
		this.id = id;
		this.preis = preis;
	}
	
}

