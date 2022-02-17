package pak01;

import java.util.List;

interface I4 {
	void go(int wert);
}

public class DemoMethodenReferenzen {
	public static void main(String[] args) {
		I4 i = wert->System.out.println();	
		
		i = DemoMethodenReferenzen::doStuff;
		i.go(10);
		
		List.of("Eins", "Zwei").forEach(System.out::println);
		
		List.of("Eins", "Zwei").forEach(DemoMethodenReferenzen::doStuffWithAString);     
	}
	
	void foo() {
		DemoMethodenReferenzen dm = new DemoMethodenReferenzen();
		List.of("Eins", "Zwei").forEach(this::doStuffWithAStringNonStatic);
		List.of("Eins", "Zwei").forEach(dm::doStuffWithAStringNonStatic);		
	}
	
	private static void doStuff(int i) {
		System.out.println("doStuff");
		System.out.println(i);
	}
	
	private static void doStuffWithAString(String s) {
		System.out.println("doStuffWithAString sagt: " + s);
	}
	
	private void doStuffWithAStringNonStatic(String s) {
		System.out.println("doStuffWithAString sagt: " + s);
	}
}
