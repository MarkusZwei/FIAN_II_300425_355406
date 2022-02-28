package demo05_decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DemoDecorator {
	public static void main(String[] args) {
		
		//Normale Nutzung ohne Decorator
		Kaufvertrag vertrag = new Kaufvertrag();
		vertrag.freigeben();
		vertrag.setVertragsbeginn(LocalDate.of(2022, 2, 1));
		
		//Nutzung mit AddonArchivierung
		AddonArchivierung vertragMitArchivierung = new AddonArchivierung(vertrag);
		vertragMitArchivierung.freigeben();
		vertragMitArchivierung.kuendigen(LocalDate.now());
		vertragMitArchivierung.archivieren();
		
		//Nutzung mit beiden Addons
		AddonVerschluesselung kaufVertragMitBeidem = new AddonVerschluesselung(vertragMitArchivierung);
		kaufVertragMitBeidem.freigeben();
		kaufVertragMitBeidem.verschluesseln();
		((AddonArchivierung)kaufVertragMitBeidem.getVertrag()).archivieren();
		
		//Nutzung nur mit Verschluesselung
		AddonVerschluesselung kaufvertragNurVerschluesselung = new AddonVerschluesselung(vertrag);
		kaufvertragNurVerschluesselung.freigeben();
		kaufvertragNurVerschluesselung.kuendigen(LocalDate.now());
		kaufvertragNurVerschluesselung.verschluesseln();
		
		
		try {
			FileReader fr = new FileReader(new File(""));
			BufferedReader br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Integer i1 = 10;
		List<Integer> list = new ArrayList<>();
		list.add(i1);
		list.add(20);
		
		
	}
}
