package demo06_factoryPattern;

public abstract class Fakturierer {
	public abstract Dokument erzeugeDokument(int belegnummer);
	
	public boolean isValid(Dokument dokument) {
		if(dokument.getBelegnummer()<=0)
			return false;
		return true;
	}
	
	public void fakturiereDokument(int belegnummer) {
		Dokument dokument = this.erzeugeDokument(belegnummer);
		if(!isValid(dokument)){
			throw new IllegalArgumentException("Das zu verarbeitende Dokument ist nicht gueltig");
		}
		System.out.println(dokument.getClass().getSimpleName() + " wird verarbeitet");
		//Verarbeitung des Dokuments
	}
}
