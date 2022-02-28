package demo06_factoryPattern.methodeMitParametern;

import demo06_factoryPattern.Rechnung;

public class Teilzahlungsrechnung extends Rechnung{

	public Teilzahlungsrechnung(int belegnummer) {
		super(belegnummer);
	}
	
}
