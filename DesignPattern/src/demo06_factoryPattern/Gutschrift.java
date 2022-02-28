package demo06_factoryPattern;

public class Gutschrift extends Dokument{
	private int gutschriftBetrag;

	public int getGutschriftBetrag() {
		return gutschriftBetrag;
	}

	public void setGutschriftBetrag(int gutschriftBetrag) {
		this.gutschriftBetrag = gutschriftBetrag;
	}
	
	public Gutschrift(int belegnummer) {
		super(belegnummer);
		this.setGutschriftBetrag(10);
	}
}
