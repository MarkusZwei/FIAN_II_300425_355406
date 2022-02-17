package musikshop.model.data;

import musikshop.model.interfaces.Artikel;

public class WarenkorbItem {
	private Artikel artikel;
	private int anzahl;
	private double gesamtBetragPosten;

	public Artikel getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public double getGesamtBetragPosten() {
		return gesamtBetragPosten;
	}

	public void setGesamtBetragPosten(double gesamtBetragPosten) {
		this.gesamtBetragPosten = gesamtBetragPosten;
	}

	public WarenkorbItem(int anzahl, Artikel artikel) {
		this.setAnzahl(anzahl);
		this.setArtikel(artikel);
		this.setGesamtBetragPosten(artikel.getPreis()*anzahl);
	}

	@Override
	public String toString() {
		return "WarenkorbItem [artikel=" + artikel + ", anzahl=" + anzahl + "]";
	}

}
