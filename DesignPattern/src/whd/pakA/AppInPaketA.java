package whd.pakA;

import whd.pakB.B;

public class AppInPaketA {
	public static void main(String[] args) {
		A a = new B();
		a.go();
		B b = new B();
//		b.go();
	}
}
