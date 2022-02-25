package demo04_adapter;

import java.util.ArrayList;

public class WorkflowEngine {
	ArrayList<WorkflowObjekt> workFlowObjekte;
	
	public WorkflowEngine() {
		this.workFlowObjekte = new ArrayList<>();
	}
	
	public void addWorkFlowObjekt(WorkflowObjekt workFlowObjekt) {
		workFlowObjekte.add(workFlowObjekt);
	}
	
	public WorkflowErgebnis alleWorkFlowsAusfuehren() {
		for(WorkflowObjekt workFlowObjekt : workFlowObjekte) {
			var ergebnis = workFlowObjekt.ausfuehren();
			if(!ergebnis.isWarErfolgreich()) {
				return ergebnis;
			}
		}
		var gesamtErgebnis = new WorkflowErgebnis("engine");
		gesamtErgebnis.setWarErfolgreich(true);
		return gesamtErgebnis;
	}
	
}
