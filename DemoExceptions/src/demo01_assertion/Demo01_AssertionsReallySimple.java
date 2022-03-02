package demo01_assertion;

public class Demo01_AssertionsReallySimple {
	
//	java MeineKlasse a b c
	
	public static void main(String[] args) {
		
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("Programm Argument " + i + ": " + args[i]);
		}
		
		doStuff();
		
		
		System.out.println("Beendet");
	}

	private static void doStuff() {
		int x = 10;
		int y = 12;
		
		/*
		 * Wenn die Bedingung zu false ausgewertet wird, wird ein
		 * AssertionError an die JVM geleitet.
		 */
		assert(x<y);
		
	}
	
	
}
