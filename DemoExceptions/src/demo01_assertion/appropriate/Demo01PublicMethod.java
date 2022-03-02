package demo01_assertion.appropriate;

/**
 * 
 * Don't Use Assertions to Validate Arguments to a Public Method
 * 
 * A public method might be called from code that you don't control (or from
 * code you have never seen).
 * 
 * If you need to validate public method arguments, you'll probably use
 * exceptions to throw, say, an IllegalArgumentException if the values passed to
 * the public method are invalid.
 *
 */
public class Demo01PublicMethod {

	
	public static void main(String[] args) {
		
	}
	
	public static void doStuffA(int x) {
		assert(x>0); //inappropriate
	}
	
	public static void doStuffE(int x) {
		if(x<=0)
			throw new IllegalArgumentException("Argument must be greater than zero");
	}
}
