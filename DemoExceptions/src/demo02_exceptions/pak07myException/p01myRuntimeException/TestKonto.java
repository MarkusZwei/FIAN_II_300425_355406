package demo02_exceptions.pak07myException.p01myRuntimeException;

public class TestKonto {
	public static void main(String[] args) {
		Konto k1 = new Konto(100);
		
//		double betrag = k1.geldAbheben(150);
		
//		if(betrag > 0) {
//			System.out.println("Party!!!");
//		}else {
//			System.out.println("Fernsehabend");
//		}
		
		try {
			double betrag = k1.geldAbheben(150);
			System.out.println("Betrag abgehoben: " + betrag);
		}catch(NegativSaldoException e) {
			System.out.println(e.getMessage());
			System.out.println("Bitte Saldo beachten");
		}
		
		//unchecked
		k1.geldAbheben(1000);
		
	}
}
