package musikshop.model.interfaces;

import javax.swing.ImageIcon;

public interface Artikel {
	public abstract int getArtikelId();

	void setArtikelId(int artikelId);

	String getArtName();

	void setArtName(String artikelName);

	String getArtBeschreibung();

	void setArtBeschreibung(String artBeschreibung);

	double getPreis();

	void setPreis(double preis);
	
	ImageIcon getIcon();
	
	void setIcon(ImageIcon icon);
}
