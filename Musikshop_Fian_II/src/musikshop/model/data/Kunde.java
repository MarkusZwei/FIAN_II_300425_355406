package musikshop.model.data;

public class Kunde {
	
	private String vorname;
	private String nachname;
	private String strasse;
	private String hausnummer;
	private String plz;
	private String ort;
	
	public Kunde(String vorname, String nachname, String strasse, String hausnummer, String plz, String ort) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setStrasse(strasse);
		this.setHausnummer(hausnummer);
		this.setPlz(plz);
		this.setOrt(ort);
	}
		
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return "\nKunde: \nVorname=" + vorname + "\nNachname=" + nachname + "\nStrasse=" + strasse + "\nHausnummer="
				+ hausnummer + "\nPlz=" + plz + "\nOrt=" + ort;
	}
	
	

}
