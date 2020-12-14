/**
 * Daniel Schirmer
 *
 * 14.12.2020
 * Project : Tag_14
 * ©2020
 *
 */

package bauernhofsimulator.produkte;

import bauernhofsimulator.interfaces.Kaufbar;

public class Produkt implements Kaufbar{
	private double preis;
	
	public Produkt() {
		super();
	}
	
	public Produkt(double preis) {
		super();
		this.preis = preis;
	}
	
	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public void verkaufen() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void einkaufen() {
		// TODO Auto-generated method stub	
	}
	
}
