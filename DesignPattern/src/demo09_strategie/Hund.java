package demo09_strategie;

public abstract class Hund {
	
	//Standardverhalten
	private IBellVerhalten bellVerhalten = new Knurren();
	private ILaufVerhalten laufVerhalten = new LangsamLaufen();
	
	public IBellVerhalten getBellVerhalten() {
		return bellVerhalten;
	}
	public void setBellVerhalten(IBellVerhalten bellVerhalten) {
		this.bellVerhalten = bellVerhalten;
	}
		
	public ILaufVerhalten getLaufVerhalten() {
		return laufVerhalten;
	}
	public void setLaufVerhalten(ILaufVerhalten laufVerhalten) {
		this.laufVerhalten = laufVerhalten;
	}
	
	public void bellen() {
		this.getBellVerhalten().bellen();
	}
	public void laufen() {
		this.getLaufVerhalten().laufen();
	}
	
}
