/**
 * Daniel Schirmer
 *
 * 14.12.2020
 * Project : Tag_14
 * ©2020
 *
 */

package bauernhofsimulator.futter;

import bauernhofsimulator.interfaces.Kaufbar;

public class Futter implements Kaufbar {
	private double preis;
	
	public Futter() {
		super();
	}

	public Futter(double preis) {
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
