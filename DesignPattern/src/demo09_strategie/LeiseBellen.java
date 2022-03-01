package demo09_strategie;

public class LeiseBellen implements IBellVerhalten {
	@Override
	public void bellen() {
		System.out.println(this.getClass().getSimpleName() + " bell bell leise");

	}
}
