package musikshop.model.interfaces;

public interface Artikel {
	public abstract int getArtikelId();

	void setArtikelId(int artikelId);

	String getArtName();

	void setArtName(String artikelName);

	String getArtBezeichnung();

	void setArtBezeichnung(String artBezeichnung);

	double getPreis();

	void setPreis(double preis);
}
