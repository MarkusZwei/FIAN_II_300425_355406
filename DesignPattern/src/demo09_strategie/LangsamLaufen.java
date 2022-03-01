package demo09_strategie;

public class LangsamLaufen implements ILaufVerhalten{

	@Override
	public void laufen() {
		System.out.println(this.getClass().getSimpleName() + " laeuft langsam");
		
	}

}
