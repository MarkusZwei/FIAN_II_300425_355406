package demo07_aggregation;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private List<Stuhl> stuehle = new ArrayList<>();

	public List<Stuhl> getStuehle() {
		return stuehle;
	}

	public void setStuehle(List<Stuhl> stuehle) {
		this.stuehle = stuehle;
	}
	
	public void addStuhl(Stuhl stuhl) {
		this.getStuehle().add(stuhl);
	}
	public Stuhl getStuhl() {
		return this.getStuehle().get(0);
	}
	
}
