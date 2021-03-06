package demo02_exceptions.pak01_throws;

/**
 * W?hrend der normalen Abarbeitung einer Methode kann zur Laufzeit ein
 * abnormales Ereignis auftreten, das die normale Ausf?hrung der Methode
 * unterbricht.
 * 
 * Ein solches abnormales Ereignis ist eine Exception (Ausnahme).
 * 
 * Eine Exception kann beispielsweise ein arithmetischer ?berlauf, ein Mangel an
 * Speicherplatz, eine Verletzung der Array-Grenzen, etc. darstellen.
 * 
 * Eine Exception stellt damit ein LaufzeitEreignis dar, das zum Versagen einer
 * Methode und damit zu einem Laufzeit-Fehler des Programms f?hren kann.
 */
public class Demo01FehlerArray {
	public static void main(String[] args) {
		method01();	
	}
	
	private static void method01() {
		method02();
	}

	private static void method02() {
		int[] zahlen = {1,2,3};
		int summe = 0;
		
		for (int i = 0; i <= zahlen.length; i++) {
			summe += zahlen[i];
		}
		
		System.out.println("Summe: " + summe);		
	}
}
