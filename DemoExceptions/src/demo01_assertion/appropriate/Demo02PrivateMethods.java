package demo01_assertion.appropriate;

/**
 * If you write a private method, you almost certainly wrote 
 * (or control) any code that calls it. When you assume that 
 * the logic in code calling your private method is correct,
 * you can test that assumption with an assertion as follows:
 *
 */
public class Demo02PrivateMethods {
	
	public static void main(String[] args) {
		doStuff(-1);
	}
	
	//appropriate - private Method
	private static void doStuff(int i) {
		assert(i>0);		
	}
	
	
}
