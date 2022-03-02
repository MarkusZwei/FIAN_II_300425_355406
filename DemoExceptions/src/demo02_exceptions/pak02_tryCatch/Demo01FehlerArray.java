package demo02_exceptions.pak02_tryCatch;

/**
 * Während der normalen Abarbeitung einer Methode kann zur Laufzeit ein
 * abnormales Ereignis auftreten, das die normale Ausführung der Methode
 * unterbricht.
 * 
 * Ein solches abnormales Ereignis ist eine Exception (Ausnahme).
 * 
 * Eine Exception kann beispielsweise ein arithmetischer Überlauf, ein Mangel an
 * Speicherplatz, eine Verletzung der Array-Grenzen, etc. darstellen.
 * 
 * Eine Exception stellt damit ein LaufzeitEreignis dar, das zum Versagen einer
 * Methode und damit zu einem Laufzeit-Fehler des Programms führen kann.
 */
public class Demo01FehlerArray {
	public static void main(String[] args) {
		int[] zahlen = {1,2,3};
		int summe = 0;
		
		for (int i = 0; i <= zahlen.length; i++) {
			try {
				summe += zahlen[i];				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Es wurde versucht auf Index: " + i + " zuzugreifen.");
			}
		}		
		System.out.println("Summe: " + summe);		
	}
	

}
