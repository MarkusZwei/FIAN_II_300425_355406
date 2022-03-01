package demo08_komposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Bein bein = new Bein(10);
		
		
		Lebewesen l = new Lebewesen();
//		l.getArme().add(arm);
//		l.getBeine().add(bein);
		
//		Bein bein2 = l.getBeine().get(0);
//		System.out.println(bein == bein2);
		
		l.addBein(bein.getLaenge());
		
		List<Bein> beine = l.getBeine();
		System.out.println("beine == l.beine: " +(beine == l.beine));
		System.out.println("l.beine.get(0)==beine.get(0): "+(l.beine.get(0)==beine.get(0)));
		System.out.println(l.beine.get(0));
		System.out.println(beine.get(0));
		
		
//		Lebewesen.Arm arm = l.getArm();
		Gliedmaße arm = l.getArm();
		
		Integer[] zahlen = {1,2,3};
		List<Integer> list = Arrays.asList(zahlen);
//		Arrays.ArrayList<Integer> list3 = Arrays.asList(zahlen);
		
		list.add(4); //java.lang.UnsupportedOperationException
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
	}
}
