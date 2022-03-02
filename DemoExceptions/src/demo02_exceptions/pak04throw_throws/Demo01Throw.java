package demo02_exceptions.pak04throw_throws;

public class Demo01Throw {
	
	/*
	 * Unterschied: kein s am Ende vom throw
	 * 
	 * throw wird benutzt um eine Exception zu werfen
	 * 
	 * Alles was von Throwable abgeleitet ist, kann mit dem Schlüsselwort throw
	 * geworfen werden
	 * 
	 */
	public static void main(String[] args) {
		//unchecked
		/*
		 * eine unchecked Exception kann ohne Fehlerbehandlung
		 * geworfen werden.
		 */
//		throw new ArrayIndexOutOfBoundsException();
		
		/*
		 * Wird eine checked Exception geworfen muss sie
		 * entweder aufgefangen oder propagiert werden, d.h.
		 * die aufrufende Stelle muss sich darum kümmern
		 */
//		try {
//			throw new Exception();			
//		}catch(Exception e) {
//			
//		}
		
	}
	
}
