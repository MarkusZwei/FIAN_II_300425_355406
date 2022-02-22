package musikshop.model.data;

import java.util.Objects;

import javax.swing.ImageIcon;

import musikshop.model.interfaces.Artikel;

public class Musikartikel implements Artikel {	
	private int artikelId;
	private String artName;
	private String artBeschreibung;
	private double preis;
	private ImageIcon icon;

	public int getArtikelId() {
		return artikelId;
	}

	public void setArtikelId(int artikelId) {
		this.artikelId = artikelId;
	}

	public String getArtName() {
		return artName;
	}

	public void setArtName(String artName) {
		this.artName = artName;
	}

	public String getArtBeschreibung() {
		return artBeschreibung;
	}

	public void setArtBeschreibung(String artBezeichnung) {
		this.artBeschreibung = artBezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public Musikartikel(int artikelId, String artName, String artBeschreibung, double preis) {
		this.setArtikelId(artikelId);
		this.setArtName(artName);
		this.setArtBeschreibung(artBeschreibung);
		this.setPreis(preis);
	}
	
	public Musikartikel(ImageIcon icon, int artikelId, String artName, String artBeschreibung, double preis) {
		this.setIcon(icon);
		this.setArtikelId(artikelId);
		this.setArtName(artName);
		this.setArtBeschreibung(artBeschreibung);
		this.setPreis(preis);
	}
	
	@Override
	public String toString() {
		return "Artikel [artikelId=" + artikelId + ", artName=" + artName + ", artBezeichnung=" + artBeschreibung
				+ ", preis=" + preis + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(artBeschreibung, artName, artikelId, preis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musikartikel other = (Musikartikel) obj;
		return Objects.equals(artBeschreibung, other.artBeschreibung) && Objects.equals(artName, other.artName)
				&& artikelId == other.artikelId
				&& Double.doubleToLongBits(preis) == Double.doubleToLongBits(other.preis);
	}

}
