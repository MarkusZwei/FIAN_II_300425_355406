package demo06_factoryPattern;

public abstract class Dokument {
	private int belegnummer;

	public int getBelegnummer() {
		return belegnummer;
	}

	public void setBelegnummer(int belegnummer) {
		this.belegnummer = belegnummer;
	}
	
	public Dokument(int belegnummer) {
		this.setBelegnummer(belegnummer);
	}
}
