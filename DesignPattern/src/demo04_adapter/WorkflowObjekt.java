package demo04_adapter;

public abstract class WorkflowObjekt {
	private String objektId;

	public String getObjektId() {
		return objektId;
	}

	public void setObjektId(String objektId) {
		this.objektId = objektId;
	}
	
	public WorkflowObjekt(String objektId) {
		this.setObjektId(objektId);
	}
	
	public abstract WorkflowErgebnis ausfuehren();
}
