package demo09_strategie;

public class Chihuahua extends Hund{

	public Chihuahua() {
		this.setBellVerhalten(new Klaeffen());
		this.setLaufVerhalten(new LangsamLaufen());
	}

}
