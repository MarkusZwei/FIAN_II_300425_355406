package pak01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface I1{
	void consume(Person p);
}
interface I2{
	int apply(Person p);
}
interface I3{
	int get();
}


public class DemoLambda {
	public static void main(String[] args) {
		Person p = new Person("Markus");
		I1 anoClass = new I1() {
			@Override
			public void consume(Person param) {
				System.out.println("Anonyme Klasse sagt " + param.name);				
			}			
		};
		anoClass.consume(p);
		
		I1 lambda = param->System.out.println("Lambda sagt " + param.name);
		lambda.consume(p);
		
		
		go(p, lambda);
		go(p, p1-> System.out.println());
		
		var list = List.of("Eins", "Zwei", "Drei", "Zwei", "Drei", "Vier");
		
		long erg = list.stream()
					.distinct()
					.filter((String s) -> {return s.equals("Eins");})
					.count();
		
//		list.removeIf((String s) -> {return s.equals("Eins");});
		
		
		System.out.println("Anzahl einzigartiger Einträge: " + erg);
		
		var zahlenListe = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		zahlenListe.removeIf(i-> i%2!=0);
		System.out.println(zahlenListe);
	}
	
	static void go(Person p, I1 i) {
		i.consume(p);
	}
	
	
	static void effectivlyFinal() {
		int zahl = 10;
		
		I1 i1 = new I1() {
			@Override
			public void consume(Person p) {
				System.out.println(zahl);
			}			
		};
		
		I1 i2 = p-> System.out.println(zahl);
				
	}
	
	
}

class Person{
	String name;
	
	public Person(String name) {
		this.name = name;
	}
}
