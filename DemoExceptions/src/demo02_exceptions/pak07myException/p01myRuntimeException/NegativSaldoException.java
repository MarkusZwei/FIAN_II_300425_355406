package demo02_exceptions.pak07myException.p01myRuntimeException;

public class NegativSaldoException extends RuntimeException{
	
	public NegativSaldoException(String message) {
		super(message);
	}
}
