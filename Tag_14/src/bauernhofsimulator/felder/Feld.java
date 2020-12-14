/**
 * Daniel Schirmer
 *
 * 14.12.2020
 * Project : Tag_14
 * ©2020
 *
 */

package bauernhofsimulator.felder;

import bauernhofsimulator.interfaces.Kaufbar;

public class Feld implements Kaufbar {
	private double preis;
	private double flaeche;
	
	public Feld() {
		super();
	}

	public Feld(double preis, double flaeche) {
		super();
		this.preis = preis;
		this.flaeche = flaeche;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public double getFlaeche() {
		return flaeche;
	}

	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
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
