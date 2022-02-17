package musikshop.model.data;

import java.util.ArrayList;
import java.util.List;

import musikshop.model.interfaces.Artikel;

public class Warenkorb {
	private List<WarenkorbItem> warenkorbItems;

	public List<WarenkorbItem> getWarenkorbItems() {
		return warenkorbItems;
	}

	public void setWarenkorbItems(List<WarenkorbItem> warenkorbItems) {
		this.warenkorbItems = warenkorbItems;
	}
	
	public Warenkorb() {
		this.setWarenkorbItems(new ArrayList<>());
	}
	
	public void fuegeArtikelEin(Integer anzahl, Artikel artikel) {
		this.getWarenkorbItems().add(new WarenkorbItem(anzahl, artikel));
	}

	@Override
	public String toString() {
		return "\nWarenkorb:" + warenkorbItems;
	}
	
	
	
}
