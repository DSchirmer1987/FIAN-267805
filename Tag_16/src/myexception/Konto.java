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
	private double saldo;

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
		this.saldo = saldo;
	}
	
	public void geldAbheben(double menge) throws NegativeSaldoException{
		if(menge > this.saldo) {
			throw new NegativeSaldoException("Es ist nicht genug Geld auf dem Konto!");
		} else {
			this.setSaldo(getSaldo() - menge);
		}
	}

	@Override
	public String toString() {
		return "Konto [saldo=" + saldo + "]";
	}	
}
