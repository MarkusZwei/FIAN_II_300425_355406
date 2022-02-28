package demo05_decorator;

import java.time.LocalDate;

public abstract class VertragsAddon extends Vertrag{

	private Vertrag vertrag;

	public Vertrag getVertrag() {
		return vertrag;
	}

	public void setVertrag(Vertrag vertrag) {
		this.vertrag = vertrag;
	}
	
	@Override
	public void freigeben() {
		this.getVertrag().freigeben();
	}
	@Override
	public void kuendigen(LocalDate kuendigungsdatum) {
		this.getVertrag().kuendigen(kuendigungsdatum);
	}
	
	public VertragsAddon(Vertrag vertrag) {
		this.setVertrag(vertrag);
	}
	
}
