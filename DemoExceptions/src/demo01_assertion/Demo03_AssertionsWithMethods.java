package demo01_assertion;

public class Demo03_AssertionsWithMethods {
	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		int x = 10;
		int y = 12;
		
		Object o1 = new Object();
		Object o2 = new Object(); 
		
		//assert (true/false) : String
		assert(o1.equals(o2)): printError(o1, o2);
		
	}
	
	private static String printError(Object o1, Object o2) {
		return "\no1.hashCode(): " + o1.hashCode() + "\no2.hashCode(): " + o2.hashCode();
	}
	
	private static String printError() {
		return "Fehlermeldung";
	}
	
}
