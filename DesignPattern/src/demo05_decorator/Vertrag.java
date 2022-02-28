package demo05_decorator;

import java.time.LocalDate;

public abstract class Vertrag {
	private LocalDate vertragsbeginn;
	private LocalDate vertragsende;
	private boolean freigeben = false;
	
	public LocalDate getVertragsbeginn() {
		return vertragsbeginn;
	}
	public void setVertragsbeginn(LocalDate vertragsbeginn) {
		this.vertragsbeginn = vertragsbeginn;
	}
	public LocalDate getVertragsende() {
		return vertragsende;
	}
	public void setVertragsende(LocalDate vertragsende) {
		this.vertragsende = vertragsende;
	}
	public boolean isFreigeben() {
		return freigeben;
	}
	public void setFreigeben(boolean freigeben) {
		this.freigeben = freigeben;
	}
	
	public abstract void freigeben();
	public abstract void kuendigen(LocalDate kuendigungsDatum);
	
	
}





