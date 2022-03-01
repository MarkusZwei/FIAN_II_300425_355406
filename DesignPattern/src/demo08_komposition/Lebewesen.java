package demo08_komposition;

import java.util.ArrayList;
import java.util.List;

interface Gliedmaﬂe{
	
}

public class Lebewesen {
	
	private static class Arm implements Gliedmaﬂe{
		private int laenge;
	}
	
	private Arm arm = new Arm();
	
	public Arm getArm() {
		return arm;
	}
	public void setArm(Arm arm) {
		this.arm = arm;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Bein> beine;
	private List<Arm> arme;
	
	public List<Bein> getBeine() {
		List<Bein> beineCopy = new ArrayList<>();
		this.beine.forEach(bein-> beineCopy.add(bein.copy()));
//		List<Bein> beineCopy = new ArrayList<>(this.beine);
		return beineCopy;
	}
	private void setBeine(List<Bein> beine) {
		this.beine = beine;
	}
	private List<Arm> getArme() {
		return arme;
	}
	private void setArme(List<Arm> arme) {
		this.arme = arme;
	}
	
	public Lebewesen() {
		this.setArme(new ArrayList<>());
		this.setBeine(new ArrayList<>());
		this.beine.add(new Bein());
	}
	
	public void addBein(int laenge) {
		this.getBeine().add(new Bein(laenge));
	}
	public void addBein(Bein bein) {
		this.getBeine().add(bein.copy());
	}
	
	public Bein getBein() {
		return this.beine.get(0).copy();
	}
	
	public void zeigeBeine() {
		this.beine.forEach(System.out::println);
	}
	
}
