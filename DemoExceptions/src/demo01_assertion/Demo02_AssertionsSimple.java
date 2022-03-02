package demo01_assertion;


/**
 * The simple version adds a second expression, separated from the first
 * (boolean expression) by a colon, this expression's string value is added to
 * the stack trace.
 * 
 * Both versions throw an immediate AssertionError, but the simple version gives
 * you a little more debugging help while the really simple version simply tells
 * you only that your assumption was false.
 * 
 * Assertions are typically enabled when an application is being tested and
 * debugged, but disabled when the application is deployed. The assertions are
 * still in the code, although ignored by the JVM, so if you do have a deployed
 * application that starts misbehaving, you can always choose to enable
 * assertions in the field for additional testing.
 */

public class Demo02_AssertionsSimple {
	public static void main(String[] args) {
		
		doStuff();
		
		System.out.println("Beendet");
	}

	private static void doStuff() {
		int x = 10;
		int y = 12;
		
		assert(x>y): "y is not greater than x. x: " + x + "y: " + y;
		
		//assert(true/false) : String - Error Message
	}
}
