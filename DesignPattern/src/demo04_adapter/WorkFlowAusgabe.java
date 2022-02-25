package demo04_adapter;

public class WorkFlowAusgabe extends WorkflowObjekt {

	private String ausgabeText;

	public String getAusgabeText() {
		return ausgabeText;
	}

	public void setAusgabeText(String ausgabeText) {
		this.ausgabeText = ausgabeText;
	}

	public WorkFlowAusgabe(String objektId, String ausgabeText) {
		super(objektId);
		this.setAusgabeText(ausgabeText);
	}
	
	@Override
	public WorkflowErgebnis ausfuehren() {
		var ergebnis = new WorkflowErgebnis(getObjektId());
		System.out.println(this.getAusgabeText());
		ergebnis.setWarErfolgreich(true);
		return ergebnis;
	}

}
