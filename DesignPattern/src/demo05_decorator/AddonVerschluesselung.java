package demo05_decorator;

public class AddonVerschluesselung extends VertragsAddon{

	public AddonVerschluesselung(Vertrag vertrag) {
		super(vertrag);		
	}
	
	public void verschluesseln() {
		System.out.println("Vertrag verschluesselt");
	}
}
