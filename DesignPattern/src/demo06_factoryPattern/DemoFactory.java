package demo06_factoryPattern;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import demo06_factoryPattern.methodeMitParametern.Rechnungsfakturierer;
import demo06_factoryPattern.methodeMitParametern.Rechnungstyp;

public class DemoFactory {
	public static void main(String[] args) {
		Fakturierer gf = new Gutschriftfakturierer();
		gf.fakturiereDokument(1);
		gf.fakturiereDokument(2);
		
		
		Fakturierer lf = new Lieferscheinfakturierer();
		lf.fakturiereDokument(3);
		
		doStuffMitFabrik(new Lieferscheinfakturierer(), 4);
		doStuffMitFabrik(new Gutschriftfakturierer(), 5);
		System.out.println("-------------------------------");
		Rechnungsfakturierer rf = new Rechnungsfakturierer();
		rf.fakturiereDokument(Rechnungstyp.NACHNAMERECHNUNG,0);
		rf.fakturiereDokument(Rechnungstyp.VORAUSRECHNUNG,0);
		rf.fakturiereDokument(Rechnungstyp.TEILZAHLUNGSRECHNUNG,0);
		
		
		LocalDate dt = LocalDate.of(2022, 2, 27);
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		
	}
	
	static void doStuffMitFabrik(Fakturierer f, int belegnummer) {
		f.fakturiereDokument(belegnummer);
	}
}
