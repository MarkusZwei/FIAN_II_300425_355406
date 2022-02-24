package demo02_classLoader;

public class DemoWannWerdenKlassenGeladen {
	public static void main(String[] args) {
//		One o = null;
//		Two t = new Two();
		
		/*
		 * This program prints only:

		1729

		because the class Sub is never initialized; the reference to Sub.taxi is a 
		reference to a field actually declared in class 
		Super and does not trigger initialization of the class Sub. 
		 */
		System.out.println(Sub.taxi);
	}
}
class Super {
	static {
		System.out.print("Super ");
	}
}
class One {
	static {
		System.out.print("One ");
	}
}
class Two extends Super {
	static {
		System.out.print("Two ");
	}
}

class Super2 {
	static int taxi = 1729;
}

class Sub extends Super2 {
	static {
		System.out.print("Sub ");
	}
}
