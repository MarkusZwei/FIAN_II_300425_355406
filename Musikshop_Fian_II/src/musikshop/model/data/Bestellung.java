package musikshop.model.data;

public class Bestellung {
	private Kunde kunde;
	private Warenkorb warenkorb;
	private double gesamtBetrag;

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Warenkorb getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;
	}

	public double getGesamtBetrag() {
		return gesamtBetrag;
	}

	public void setGesamtBetrag(double gesamtBetrag) {
		this.gesamtBetrag = gesamtBetrag;
	}

	public Bestellung(Kunde kunde, Warenkorb warenkorb) {
		this.setKunde(kunde);
		this.setWarenkorb(warenkorb);
		double gesamtBetrag= 0;
		for (int i = 0; i < this.getWarenkorb().getWarenkorbItems().size(); i++) {
			gesamtBetrag += this.getWarenkorb().getWarenkorbItems().get(i).getGesamtBetragPosten();
		}
		this.setGesamtBetrag(gesamtBetrag);		
	}

	@Override
	public String toString() {
		return "Bestellung :\n" + kunde + warenkorb + "\nGesamter Rechnungsbetrag: " + this.getGesamtBetrag();
	}

}
