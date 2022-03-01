package demo08_komposition;

public class Bein {
	private int laenge;

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public Bein(int laenge) {
		this.laenge = laenge;
	}

	public Bein() {

	}
	
	public Bein copy() {
		Bein copy = new Bein();
		copy.laenge = this.laenge;
		return copy;
	}
}
