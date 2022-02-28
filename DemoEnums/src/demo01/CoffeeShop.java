package demo01;

public class CoffeeShop{
	public static void main(String[] args) {
		Coffee c = new Coffee();
		c.size = CupSize.SMALL;
		c.sizeAlsKlasse = EnumAlsKlasse.SMALL;
		
		CupSize size = CupSize.MEDIUM;
		System.out.println(size.ml);
		System.out.println(size.ordinal());
		System.out.println(size.toString());
		
		CupSize[] sizes = CupSize.values();
		
		CupSize size2 = CupSize.MEDIUM;
		System.out.println(size == size2);
	}
}

class Coffee{
	public CupSize size;
	EnumAlsKlasse sizeAlsKlasse;
	
}

enum CupSize{	
	SMALL(100),MEDIUM(250),LARGE(350);	
	
	public int ml;
	
	private CupSize(int ml) {
		this.ml = ml;
	}
}

class EnumAlsKlasse{
	public static final EnumAlsKlasse SMALL = new EnumAlsKlasse(100);
	public static final EnumAlsKlasse MEDIUM = new EnumAlsKlasse(250);
	public static final EnumAlsKlasse LARGE = new EnumAlsKlasse(350);
	
	int ml;
	
	private EnumAlsKlasse(int ml) {
		this.ml = ml;
	}
}
interface I{
	public static final int SMALL = 0;
}