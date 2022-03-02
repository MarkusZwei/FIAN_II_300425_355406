package demo02_exceptions.pak03_myException;

public class MyClass {
	public static void main(String[] args) {
		try {
			myExceptionThrow();
		} catch (Exception e) {
			System.out.println("Der Fehler wurde gefangen");
		}

	}

	public static void myExceptionThrow() {
		final int wert = 10;
		if (wert == 10) {
			MyException myException = new MyException();
			throw myException;
		}
	}
}
