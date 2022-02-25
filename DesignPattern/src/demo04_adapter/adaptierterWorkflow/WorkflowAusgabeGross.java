package demo04_adapter.adaptierterWorkflow;

public class WorkflowAusgabeGross {
	private String ausgabeText;
	
	public WorkflowAusgabeGross(String ausgabeText) {
		this.setAusgabeText(ausgabeText);
	}

	public String getAusgabeText() {
		return ausgabeText;
	}

	public void setAusgabeText(String ausgabeText) {
		this.ausgabeText = ausgabeText;
	}
	
	public WorkFlowErgebnisB starten() {
		System.out.println(this.getAusgabeText().toUpperCase());
		var ergebnis = new WorkFlowErgebnisB(1);
		return ergebnis;
	}
}
