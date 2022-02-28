package demo05_decorator;

public class AddonArchivierung extends VertragsAddon{

	public AddonArchivierung(Vertrag vertrag) {
		super(vertrag);
	}
	
	public void archivieren() {
		System.out.println("Vertrag archiviert");
	}
}
