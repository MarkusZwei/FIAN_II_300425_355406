package demo09_strategie;

public class SchnellLaufen implements ILaufVerhalten{
	@Override
	public void laufen() {
		System.out.println(this.getClass().getSimpleName() + " laeuft schnell");		
	}
}
