package musikshop.model.data;

import java.util.Objects;

import musikshop.model.interfaces.Artikel;

public class Musikartikel implements Artikel{
	private int artikelId;
	private String artName;
	private String artBezeichnung;
	private double preis;

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

	public String getArtBezeichnung() {
		return artBezeichnung;
	}

	public void setArtBezeichnung(String artBezeichnung) {
		this.artBezeichnung = artBezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public Musikartikel(int artikelId, String artName, String artBezeichnung, double preis) {
		this.setArtikelId(artikelId);
		this.setArtName(artName);
		this.setArtBezeichnung(artBezeichnung);
		this.setPreis(preis);
	}
	
	@Override
	public String toString() {
		return "Artikel [artikelId=" + artikelId + ", artName=" + artName + ", artBezeichnung=" + artBezeichnung
				+ ", preis=" + preis + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(artBezeichnung, artName, artikelId, preis);
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
		return Objects.equals(artBezeichnung, other.artBezeichnung) && Objects.equals(artName, other.artName)
				&& artikelId == other.artikelId
				&& Double.doubleToLongBits(preis) == Double.doubleToLongBits(other.preis);
	}
	
	
	
}
