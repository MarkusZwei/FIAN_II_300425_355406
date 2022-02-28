package demo06_factoryPattern;

public class Lieferscheinfakturierer extends Fakturierer{

	@Override
	public Dokument erzeugeDokument(int belegnummer) {		
		return new Lieferschein(belegnummer);
	}

	@Override
	public void fakturiereDokument(int belegnummer) {
		Dokument dokument = this.erzeugeDokument(belegnummer);
		System.out.println(dokument.getClass().getSimpleName() + " mit der Belegnummer " + dokument.getBelegnummer() +" wird verarbeitet");	
		//Rechnung verarbeiten
	}
}
