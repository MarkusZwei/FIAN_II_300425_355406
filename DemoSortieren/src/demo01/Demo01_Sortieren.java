package demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Demo01_Sortieren {
	public static void main(String[] args) {
		Comparable<PersonOhneComparable> comparable;
		Comparator<PersonOhneComparable> comparator;

		var p = new PersonMitComparable("Markus", "Szyska", 45);
		var p1 = new PersonMitComparable("Christian", "Schirmer", 40);
		var p2 = new PersonMitComparable("Max", "Mustermann", 30);

		// -------------------------- Arrays Comparable
		// -----------------------------------
		PersonMitComparable[] arr = { p, p1, p2 };
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println("\n -----------------------Nach der Sortierung-----------------");
		System.out.println(Arrays.toString(arr));

		var poC = new PersonOhneComparable("Markus", "Szyska", 45);
		var poC1 = new PersonOhneComparable("Christian", "Schirmer", 40);
		var poC2 = new PersonOhneComparable("Max", "Mustermann", 30);

		System.out.println("------------------------- Arrays ohne Comparable -----------------------");
		PersonOhneComparable[] arroC = { poC, poC1, poC2 };
		System.out.println(Arrays.toString(arroC));

//		Arrays.sort(arroC);
		Comparator<PersonOhneComparable> comp = new Comparator<PersonOhneComparable>() {
			@Override
			public int compare(PersonOhneComparable o1, PersonOhneComparable o2) {
				return o1.alter - o2.alter;
			}

		};
		Arrays.sort(arroC, comp);
		System.out.println("\n -----------------------Nach der Sortierung-----------------");
		System.out.println(Arrays.toString(arroC));

		System.out.println("------------------------- List ohne Comparable -----------------------");
		var persList = new ArrayList<>(List.of(poC, poC1, poC2));
		persList.sort(comp);

		System.out.println(persList);

		
		System.out.println("------------------------- TreeSet mit Comparable -----------------------");		
		var setmC = new TreeSet<>();
		setmC.add(p);
		setmC.add(p1);
		setmC.add(p2);
		
		System.out.println(setmC);
		
		System.out.println("------------------------- TreeSet ohne Comparable -----------------------");		
		var setoC = new TreeSet<>(comp);
		setoC.add(poC);
		setoC.add(poC1);
		setoC.add(poC2);
		System.out.println(setoC);
		
		Set<PersonOhneComparable> setoC1 = new TreeSet<>((o1, o2)->o1.vorname.compareTo(o2.vorname));
		setoC1.add(poC);
		setoC1.add(poC1);
		setoC1.add(poC2);
		System.out.println(setoC1);
		
		Set<PersonOhneComparable> setoC2 = new TreeSet<>(Demo01_Sortieren::personNachNachname);
		setoC2.add(poC);
		setoC2.add(poC1);
		setoC2.add(poC2);
		System.out.println(setoC2);
		
	}
	
	public static int personNachNachname(PersonOhneComparable p1, PersonOhneComparable p2) {
		return p1.nachname.compareTo(p2.nachname);
	}
}

class PersonOhneComparable {
	public String vorname;
	public String nachname;
	public int alter;

	public PersonOhneComparable(String vorname, String nachname, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alter, nachname, vorname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonOhneComparable other = (PersonOhneComparable) obj;
		return alter == other.alter && Objects.equals(nachname, other.nachname)
				&& Objects.equals(vorname, other.vorname);
	}

	@Override
	public String toString() {
		return "PersonOhneComparable [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + alter + "]\n";
	}

}

class PersonMitComparable implements Comparable<PersonMitComparable> {
	public String vorname;
	public String nachname;
	public int alter;

	public PersonMitComparable(String vorname, String nachname, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alter, nachname, vorname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonMitComparable other = (PersonMitComparable) obj;
		return alter == other.alter && Objects.equals(nachname, other.nachname)
				&& Objects.equals(vorname, other.vorname);
	}

	@Override
	public int compareTo(PersonMitComparable o) {
		return this.alter - o.alter;
	}

	@Override
	public String toString() {
		return "PersonMitComparable [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + alter + "]\n";
	}

}
