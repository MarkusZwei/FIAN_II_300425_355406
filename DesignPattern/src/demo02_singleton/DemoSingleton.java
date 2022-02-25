package demo02_singleton;

/*
 * Beim Singleton geht es darum, dass von einer Klasse 
 * zur Laufzeit nur ein Objekt existiert
 */
public class DemoSingleton {
	
	public static void main(String[] args) {
//		var konf1 = new Konfiguration();
//		var konf2 = new Konfiguration();
//		var konf3 = new Konfiguration();
		
		var konf1 = Konfiguration.getInstance();
		var konf2 = Konfiguration.getInstance();
		
		System.out.println(konf1);
		System.out.println(konf2);
		System.out.println(konf1==konf2);
	}
}

class Konfiguration{
	/*
	 * Der eigentliche Speicher für das Objekt ist ein Klassenattribut.
	 * Es muss private sein, da nur die Klasse selber es zuweisen darf.
	 */
	private static Konfiguration instanz;
	/*
	 * Konstruktor wird private, damit von aussen kein
	 * Objekt erzeugt werden kann.
	 */
	private Konfiguration() {
			
	}	
	/*
	 * Es muss eine Methode existieren, die eine 
	 * Instanz nach draussen gibt
	 */
	//t1
	//t2
	public static Konfiguration getInstance() {
		if(instanz == null) {			
			//t1 - stopped by Thread Scheduler
			instanz = new Konfiguration();
		}
		return instanz;//t2 - stopped by Thread Scheduler
	}
	
}

class KonfigurationThreadSafe{
	/*
	 * Der eigentliche Speicher für das Objekt ist ein Klassenattribut.
	 * Es muss private sein, da nur die Klasse selber es zuweisen darf.
	 */
	private static KonfigurationThreadSafe instanz;
	/*
	 * Konstruktor wird private, damit von aussen kein
	 * Objekt erzeugt werden kann.
	 */
	private KonfigurationThreadSafe() {
			
	}	
	/*
	 * Es muss eine Methode existieren, die eine 
	 * Instanz nach draussen gibt
	 */
	public static KonfigurationThreadSafe getInstance() {		
		synchronized (KonfigurationThreadSafe.class) {
			if(instanz == null) {						
				instanz = new KonfigurationThreadSafe();
			}
			return instanz;			
		}
	}	
}
class SimpleSingleton{
	
	private static SimpleSingleton instanz = new SimpleSingleton();
	
	private SimpleSingleton() {
		
	}
	
	public static SimpleSingleton getInstance() {
		return instanz;
	}
}


