package musikshop.model;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.swing.ImageIcon;

import musikshop.model.crud.SQLiteConnection;
import musikshop.model.data.Bestellung;
import musikshop.model.data.Kunde;
import musikshop.model.data.Musikartikel;
import musikshop.model.data.Sortiment;
import musikshop.model.data.Warenkorb;
import musikshop.model.data.WarenkorbItem;
import musikshop.model.interfaces.Artikel;
import musikshop.model.interfaces.DBConnection;

public class MainModel {
	private DBConnection dbConnection;
	private List<Artikel> artList;
	private Sortiment sortiment;
	private Warenkorb warenkorb;

	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public List<Artikel> getArtList() {
		return artList;
	}

	public void setArtList(List<Artikel> artList) {
		this.artList = artList;
	}

	public Sortiment getSortiment() {
		return sortiment;
	}

	public void setSortiment(Sortiment sortiment) {
		this.sortiment = sortiment;
	}

	public Warenkorb getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;
	}

	public MainModel() {
		this.setDbConnection(new SQLiteConnection());
		this.setArtList(new ArrayList<>());
		this.setSortiment(new Sortiment());
		this.setWarenkorb(new Warenkorb());

//		this.ladeSortiment();
		this.ladeSortimentMitBildern();

	}

	private void ladeSortiment() {
		try {
			ResultSet res = this.getDbConnection().getAllArticles();
			while (res.next()) {
				this.getSortiment().getAlleArtikel()
						.add(new Musikartikel(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void ladeSortimentMitBildern() {
		try {
			ResultSet res = this.getDbConnection().getAllArticlesWithPictures();
			while (res.next()) {
				this.getSortiment().getAlleArtikel().add(new Musikartikel(this.decodeImage(res.getString("bild")),
						res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Artikel> getSortimentAsList() {
		return new ArrayList<>(this.getSortiment().getAlleArtikel());
	}

	public void addItemToCart(String artikelName, Integer anzahl) {
		System.out.println(anzahl + " " + artikelName + " wurde zum Warenkorb hinzugefügt");
		Set<Artikel> sortiment = this.getSortiment().getAlleArtikel();

		Optional<Artikel> opt = sortiment.stream().filter(a -> a.getArtName().equals(artikelName)).findFirst();
		if (anzahl > 0 && opt.isPresent()) {
			Artikel artikel = opt.get();
			this.getWarenkorb().fuegeArtikelEin(anzahl, artikel);
		}
	}

	public void aendereAnzahlArtikelImWK(String artikelname, Integer spinnerValue) {
//		System.out.println("artikelname: " + artikelname);
//		System.out.println("spinnerValue: " + spinnerValue);
		for (WarenkorbItem item : this.getWarenkorb().getWarenkorbItems()) {
			if (artikelname.equals(item.getArtikel().getArtName())) {
				if (item.getAnzahl() < spinnerValue) {
					item.setAnzahl(item.getAnzahl() + (spinnerValue - item.getAnzahl()));
				} else {
					item.setAnzahl(spinnerValue);
				}
			}
		}
		this.getWarenkorb().getWarenkorbItems().removeIf(item->item.getAnzahl() == 0);
//		System.out.println("Laenge des WK: " +this.getWarenkorb().getWarenkorbItems().size());
//		this.getWarenkorb().getWarenkorbItems().stream()
//				.filter(item -> item.getArtikel().getArtName().equals(artikelname)).forEach(wkItem -> {
//					if (wkItem.getAnzahl() < spinnerValue) {
//						wkItem.setAnzahl(wkItem.getAnzahl() + (spinnerValue - wkItem.getAnzahl()));
//					} else {
//						wkItem.setAnzahl(spinnerValue);
//					}
//				});
	}

	public void bestellungAbschicken(Map<String, String> data) {
		Bestellung bestellung = new Bestellung(new Kunde(data.get("vorname"), data.get("nachname"), data.get("strasse"),
				data.get("hausnummer"), data.get("plz"), data.get("ort")), this.getWarenkorb());
		System.out.println(bestellung);
	}

	public String encodeImage(String imageName) {
		try {
			byte[] originalBytes = Files.readAllBytes(Paths.get(this.getClass().getResource("/" + imageName).toURI()));
			byte[] encoded = Base64.getEncoder().encode(originalBytes);
			String encodeString = new String(encoded);
			return encodeString;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ImageIcon decodeImage(String encodedImage) {
		byte[] decoded = Base64.getDecoder().decode(encodedImage);
		ImageIcon iIcon = new ImageIcon(decoded);
		ImageIcon iIconScaled = new ImageIcon(iIcon.getImage().getScaledInstance(115, 106, 0));
		return iIconScaled;
	}

	public ImageIcon getPicture() {
		try {
			byte[] originalBytes = Files.readAllBytes(Paths.get(this.getClass().getResource("/schadel.png").toURI()));
			System.out.println(originalBytes.length);
			byte[] encoded = Base64.getEncoder().encode(originalBytes);
			System.out.println(encoded.length);
			System.out.println(new String(encoded).length());

			byte[] decoded = Base64.getDecoder().decode(encoded);
			System.out.println(decoded.length);

			ImageIcon iIcon = new ImageIcon(decoded);
			ImageIcon iIconScaled = new ImageIcon(iIcon.getImage().getScaledInstance(115, 106, 0));
			return iIconScaled;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		MainModel m = new MainModel();
//		String encoded1 = m.encodeImage("bass.png");
//		String encoded2 = m.encodeImage("elektrischer-bass.png");
//		String encoded3 = m.encodeImage("rocknroll.png");
//		String encoded4 = m.encodeImage("schadel.png");
//		
//		try {
//			m.getDbConnection().addImageToDB(encoded1, 1);
//			m.getDbConnection().addImageToDB(encoded2, 2);
//			m.getDbConnection().addImageToDB(encoded3, 3);
//			m.getDbConnection().addImageToDB(encoded4, 4);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}

	}
}
