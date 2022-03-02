package demo01_assertion.appropriate;

/**
 * Don't Use Assert Expressions that Can Cause Side Effects!
 * 
 * The rule is, an assert expression should leave the program in the same state
 * it was in before the expression!
 * 
 * Think about it. assert expressions aren't guaranteed to always run, so you
 * don't want your code to behave differently depending on whether assertions
 * are enabled.
 * 
 * Assertions must not cause any side effects.
 * 
 * If assertions are enabled, the only change to the way your program runs is
 * that an AssertionError can be thrown if one of your assertions (think:
 * assumptions) turns out to be false.
 */
public class Demo05SideEffects {
	
	static int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
		try {
			doStuff();			
		}catch(AssertionError e) {
			
		}		
		System.out.println("x: " + x + " y: " + y);
	}
	
	public static void doStuff() {
		assert(modifyThings());
	}
	
	public static boolean modifyThings() {
		y = x++;
		return false;
	}
	
}
