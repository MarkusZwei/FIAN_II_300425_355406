package whd.interfaces_Vererbung;

interface IDrucker{
	void drucken();
}
interface IScanner{
	void scannen();
}
interface IKombigeraet extends IDrucker, IScanner{
	
}
class Einfacherdrucker implements IDrucker{
	@Override
	public void drucken() {
		
	}
	
}

class Kombidrucker implements IKombigeraet{
	@Override
	public void drucken() {
		
	}
	@Override
	public void scannen() {
		
	}	
}

public class Application {
	public static void main(String[] args) {
		IDrucker id1 = new Kombidrucker();
		id1.drucken();
//		id1.scannen();
		IScanner is1 = (IScanner)id1;
		is1.scannen();
		
		IKombigeraet ik1 = new Kombidrucker();
		ik1.drucken();
		ik1.scannen();
		
	}
	
	static void go(IKombigeraet id) {
		id.drucken();
		id.scannen();
	}
}
