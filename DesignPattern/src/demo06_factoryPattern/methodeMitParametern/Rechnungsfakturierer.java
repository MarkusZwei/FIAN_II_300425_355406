package demo06_factoryPattern.methodeMitParametern;

import demo06_factoryPattern.Dokument;
import demo06_factoryPattern.Fakturierer;
import demo06_factoryPattern.Rechnung;

public class Rechnungsfakturierer extends Fakturierer {

	@Override
	public Dokument erzeugeDokument(int belegnummer) {
		return new Rechnung(belegnummer);
	}

	public Dokument erzeugeDokument(Rechnungstyp art, int belegnummer) {
		switch (art) {
		case NACHNAMERECHNUNG:
			return new Nachnamerechnung(belegnummer);
		case VORAUSRECHNUNG:
			return new Teilzahlungsrechnung(belegnummer);
		case TEILZAHLUNGSRECHNUNG:
			return new Vorausrechnung(belegnummer);
		default:
			return new Rechnung(belegnummer);
		}
	}

	
	public void fakturiereDokument(Rechnungstyp art, int belegnummer) {
		Dokument dokument = this.erzeugeDokument(art, belegnummer);
		System.out.println(dokument.getClass().getSimpleName() + " mit der Belegnummer " + dokument.getBelegnummer()
				+ " wird verarbeitet");
		// Rechnung verarbeiten
	}

}
