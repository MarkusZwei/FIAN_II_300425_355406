package whd;


public class AbstractClasses {
	public static void main(String[] args) {
		A a = new A();
//		B b = new B();
		
		A a1 = new C();
		a1.go();
		
		int zahl;
//		System.out.println(zahl);
		
		int[] arr = new int[5];
		System.out.println(arr[0]);
		
		int[][] twoDim = new int[5][];
		System.out.println(twoDim[0]);
		System.out.println(twoDim.length);
		
		twoDim[0] = new int[10];
		twoDim[1] = new int[5];
		
		int[][][] threeDim = new int[5][][];
//		System.out.println(threeDim[1].length); //NullPointer
		
		
		A i1 = new A();
		i1.defMethod();
		
	}
}

interface I {
	int wert=0;	
	void goI();
	
	default void defMethod() {
		System.out.println("default Method in I");
	}
	
	static void staticMethod() {
		System.out.println("static Method in I");
	}
	
	private static void privateStaticMethod() {
		System.out.println("private Static");
	}
}

class A implements I{
	
	static int wertStatic;  //0
	int wertNonStatic;		//0
	String text; 			//null
	boolean bool;			//false
	
	public void goI() {
		System.out.println(this.wertNonStatic);
	}
	
	void go() {
		System.out.println("go in A");
	}
}

abstract class B extends A{
	abstract void go();
	void doStuff() {
		this.go();
	}
}

class C extends B{
	@Override
	public void go() {
		System.out.println("go in C");
	}	
}