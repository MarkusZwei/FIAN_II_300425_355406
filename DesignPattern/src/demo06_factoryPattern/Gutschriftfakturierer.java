package demo06_factoryPattern;

public class Gutschriftfakturierer extends Fakturierer{

	@Override
	public Dokument erzeugeDokument(int belegnummer) {		
		return new Gutschrift(belegnummer);
	}

	@Override
	public void fakturiereDokument(int belegnummer) {
		Dokument dokument = this.erzeugeDokument(belegnummer);
		if(!isValid(dokument)) {
			throw new IllegalArgumentException("Die zu bearbeitende Gutschrift ist nicht gueltig");
		}
		System.out.println(dokument.getClass().getSimpleName() + " mit der Belegnummer: " + dokument.getBelegnummer() + " wird verarbeitet");
		//Verarbeitung der Gutschrift
	}
	
	@Override
	public boolean isValid(Dokument dokument) {
		return super.isValid(dokument)&& ((Gutschrift)dokument).getGutschriftBetrag()>0;
	}
}
