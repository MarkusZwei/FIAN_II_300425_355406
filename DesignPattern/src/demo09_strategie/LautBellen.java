package demo09_strategie;

public class LautBellen implements IBellVerhalten{

	@Override
	public void bellen() {
		System.out.println(this.getClass().getSimpleName() + " BELL BELL LAUT");
		
	}

}
