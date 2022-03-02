package demo02_exceptions.pak03_myException;

public class MyException extends RuntimeException {
	
	public MyException() {
		super("Fehler ist aufgetreten");
	}
}
