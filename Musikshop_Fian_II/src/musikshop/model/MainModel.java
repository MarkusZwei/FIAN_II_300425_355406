package musikshop.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import musikshop.model.crud.SQLiteConnection;
import musikshop.model.data.Bestellung;
import musikshop.model.data.Kunde;
import musikshop.model.data.Musikartikel;
import musikshop.model.data.Sortiment;
import musikshop.model.data.Warenkorb;
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
		this.ladeSortiment();
		this.setWarenkorb(new Warenkorb());
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

	public void bestellungAbschicken(Map<String, String> data) {
		Bestellung bestellung = new Bestellung(new Kunde(data.get("vorname"), data.get("nachname"), data.get("strasse"),
				data.get("hausnummer"), data.get("plz"), data.get("ort")), this.getWarenkorb());
		System.out.println(bestellung);
	}

}
