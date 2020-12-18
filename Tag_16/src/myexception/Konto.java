/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package myexception;

public class Konto {
	public double saldo;

	public Konto(double saldo) {
		super();
		this.saldo = saldo;
	}

	public Konto() {
		this(5.0);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo > 500000) {
			this.meldung();
		} else {
			this.saldo = saldo;
		}
	}
	
	public void geldAbheben(double menge) throws NegativeSaldoException{
		if(menge > this.saldo) {
			throw new NegativeSaldoException("Es ist nicht genug Geld auf dem Konto!");
		} else {
			this.setSaldo(getSaldo() - menge);
		}
	}
	
	private void meldung() {
		System.out.println("Für so viel Geld bitte termin vereinbaren");
	}

	@Override
	public String toString() {
		return "Konto [saldo=" + saldo + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalize");
	}
	
	
}
