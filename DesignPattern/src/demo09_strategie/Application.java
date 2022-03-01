package demo09_strategie;

public class Application {
	public static void main(String[] args) {
		Boxer b1 = new Boxer();
		Boxer b2 = new Boxer();
		Chihuahua c1 = new Chihuahua();
		
		b1.bellen();
		b2.bellen();
		
		b2.setBellVerhalten(new Klaeffen());
		
		System.out.println("\nBoxer b2 hat sein Verhalten geaendert");
		b1.bellen();
		b2.bellen();
		c1.bellen();
		
		System.out.println("\nJetzt wird gerannt");
		b1.laufen();
		b2.laufen();
		c1.laufen();
		
		b2.setLaufVerhalten(new LangsamLaufen());
		b2.laufen();
	}
}
