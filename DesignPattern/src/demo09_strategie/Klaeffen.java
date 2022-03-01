package demo09_strategie;

public class Klaeffen implements IBellVerhalten{

	@Override
	public void bellen() {
		System.out.println(this.getClass().getSimpleName() + " KLAEFF KLAEFF");		
	}

}
