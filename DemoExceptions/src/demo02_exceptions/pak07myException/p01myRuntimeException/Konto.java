package demo02_exceptions.pak07myException.p01myRuntimeException;

public class Konto {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Konto(double saldo) {
		this.setSaldo(saldo);
	}
	
	public void geldEinzahlen(double saldo) {
		this.setSaldo(this.getSaldo() + saldo);
	}
	
	/**
	 * 
	 * @param saldo
	 * @return abgehobener Betrag
	 * @throws NegativSaldoException
	 */
	public double geldAbheben(double saldo)throws NegativSaldoException {
		if(saldo > this.getSaldo()) {
//			System.out.println("Leider nicht genug Geld da!");
			throw new NegativSaldoException("Leider nicht genug Geld da!");
//			return 0;
		}else {
			this.setSaldo(this.getSaldo() - saldo);
			return saldo;
		}
	}
	
	
	@Override
	public String toString() {
		return "Saldo verfuegbar: " + this.getSaldo();
	}
}
