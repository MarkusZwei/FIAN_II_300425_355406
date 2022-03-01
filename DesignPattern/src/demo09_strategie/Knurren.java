package demo09_strategie;

public class Knurren implements IBellVerhalten{
	@Override
	public void bellen() {
		System.out.println( this.getClass().getSimpleName() + "Knuuuuurrrrrrrr");		
	}
}
