package demo04_adapter.adaptierterWorkflow;

import demo04_adapter.WorkflowErgebnis;
import demo04_adapter.WorkflowObjekt;

public class WorkflowAdapterAusgabeGross extends WorkflowObjekt{
	/*
	 * Die Adapterklasse erh�lt eine Referenz auf ein Objekt 
	 * der zu adaptierenden Klasse
	 */
	private WorkflowAusgabeGross instanz;
	
	public WorkflowAdapterAusgabeGross(String objektId, String ausgabeText ) {
		super(objektId);
		this.instanz = new WorkflowAusgabeGross(ausgabeText);
	}
	/*
	 * Der Adapter erweitert die Systemklasse und ist damit kompatibel zum System
	 * Wenn das System die ausfuehren() Methode aufruft, ruft die �berschriebene
	 * Adaptermethode das entsprechende Gegenst�ck in der inkompatiblen,
	 * zu adaptierenden Klasse auf. Das ebenfalls inkompatible Ergebnis 
	 * wird auf Erfolg gepr�ft und ein entsprechend kompatibles Ergebnis Objekt
	 * zur�ckgegeben
	 */
	@Override
	public WorkflowErgebnis ausfuehren() {
		WorkflowErgebnis ergebnis = new WorkflowErgebnis(getObjektId());
		
		WorkFlowErgebnisB ergebnisB = this.instanz.starten();
		if(ergebnisB.getErgebnis() > 0) {
			ergebnis.setWarErfolgreich(true);
		}else {
			ergebnis.setWarErfolgreich(false);
			ergebnis.setFehlermeldung("n/a");
		}
		return ergebnis;
	}

}
