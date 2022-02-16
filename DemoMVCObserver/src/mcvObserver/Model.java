package mcvObserver;

import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Model extends Observable{
	
	private List<Object> obs;
	
	private int wert;

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
		this.setChanged();
		this.notifyObservers(this.getWert());
	}
		
	public void countUp() {
		this.setWert(this.getWert()+1);
	}
	
	public void countDown() {
		this.setWert(this.getWert()-1);
	}
}
