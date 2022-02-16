package musikshop.model.data;

import musikshop.model.interfaces.Artikel;

public class WarenkorbItem {
	private Artikel artikel;
	private int anzahl;

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
	
	public WarenkorbItem(int anzahl, Artikel artikel) {
		this.setAnzahl(anzahl);
		this.setArtikel(artikel);
	}
}
