package wdhCasting;

public class DemoCasting {
	public static void main(String[] args) {
		//Referenztyp - Objekttyp
		A a = new A();
		A a1 = new B();
		A a2 = new C();
		
//		a2.goB();
//		a2.goC();
		
		((C)a2).goB();
		((C)a2).goC();
		
//		B b = new A();
		B b1 = new B();
		B b2 = new C();
		
		b2.goB();
//		b2.goC();
		
//		C c = new A();
//		C c1 = new B();
		C c2 = new C();
		
		c2.goB();
		c2.goC();
		
		System.out.println(b1.name);
		System.out.println("\n\n **********************");
		
		C c3 = new C();
		
		A a4 = new A();
		A a5 = new B();
		
		System.out.println("\n\n **********************");
		System.out.println(a4.name);  //A
		System.out.println(a5.name);  //A
		
		B b3 = new B();
		System.out.println(b3.name);  //B
		
		b3.setName("geaendert");
		System.out.println(b3.name);  //B
		System.out.println(b3.getName());// geaendert
		
		
		A a6 = new B();
//		C c4 = (C)a6; //ClassCastException
		
		
		Fressbar f = (Fressbar)new A();
		Fressbar f1 = new B();
		Fressbar f2 = new C();
		
		B a7 = (B)f1;
		
		I1 i1 = (I1)f1;
		
	}
}

interface Fressbar {
	
}

interface I1{
	
}
class A {
	String name = "A";
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A() {
		super();
		System.out.println("Konstruktor von A");
	}
}
class B extends A implements Fressbar{
	
	String name = "B";
	
	public B() {
		super();
		System.out.println("Konstruktor von B");
	}
	
	void goB() {
		System.out.println("goB()");
	}
}

class C extends B{
	
	int alter;
	
	public C() {
		super();
		System.out.println("Konstruktor von C");
	}
	void goC() {
		System.out.println("goC()");
	}
}
