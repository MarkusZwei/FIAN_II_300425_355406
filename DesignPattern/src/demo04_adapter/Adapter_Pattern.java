package demo04_adapter;

import demo04_adapter.adaptierterWorkflow.WorkflowAdapterAusgabeGross;
import demo04_adapter.adaptierterWorkflow.WorkflowAusgabeGross;

public class Adapter_Pattern {
	/*
	 * Klassenadapter
	 * 
	 * Der Klassenadapter bedient sich der Mehrfachvererbung und erbt
	 * sowohl von der Schnittstelle/Klasse des Zielsystems als auch von
	 * der zu implemetierenden Klasse
	 * 
	 * Objektadapter
	 * 
	 * Der Objektadapter kommt ohne Mehrfachvererbung aus, indem er eine Operation
	 * auf ein Objekt der adaptierten Klasse abbildet
	 */
	
	
	public static void main(String[] args) {
		var engine = new WorkflowEngine();
		var kleineAusgabe = new WorkFlowAusgabe("1", "kleine Ausgabe 1");
		var kleineAusgabe2 = new WorkFlowAusgabe("2", "kleine Ausgabe 2");
		var kleineAusgabe3 = new WorkFlowAusgabe("3", "kleine Ausgabe 3");
		
		engine.addWorkFlowObjekt(kleineAusgabe);
		engine.addWorkFlowObjekt(kleineAusgabe2);
		engine.addWorkFlowObjekt(kleineAusgabe3);
		
//		var ergebnis = engine.alleWorkFlowsAusfuehren();
//		System.out.println("Alle Workflows erfolgreich ausgefuehrt: " + ergebnis.isWarErfolgreich());
		
		WorkflowAusgabeGross grosseAusgabe = new WorkflowAusgabeGross("groﬂe Ausgabe");
		grosseAusgabe.starten();
		
//		engine.addWorkFlowObjekt(grosseAusgabe);
		
		var adapter = new WorkflowAdapterAusgabeGross("4","groﬂe Ausgabe 4");
		
		engine.addWorkFlowObjekt(adapter);
		
		var ergebnis = engine.alleWorkFlowsAusfuehren();
		System.out.println("Alle Workflows erfolgreich ausgefuehrt: " + ergebnis.isWarErfolgreich());
	}
}
