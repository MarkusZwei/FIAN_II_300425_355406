package demo05_decorator;

import java.time.LocalDate;

public class Kaufvertrag extends Vertrag{

	@Override
	public void freigeben() {
		this.setFreigeben(istGueltig());
		System.out.println("Kaufvertrag freigegeben");
		
	}

	@Override
	public void kuendigen(LocalDate kuendigungsDatum) {
		if(kuendigungsDatum.isAfter(this.getVertragsbeginn())) {
			this.setVertragsende(kuendigungsDatum);
		}
		System.out.println("Kaufvertrag gekuendigt");
	}
	
	private boolean istGueltig() {
		//Pruefe den Vertrag
		return true;
	}

}
