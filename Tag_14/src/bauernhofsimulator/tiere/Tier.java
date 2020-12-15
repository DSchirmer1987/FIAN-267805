/**
 * Daniel Schirmer
 *
 * 14.12.2020
 * Project : Tag_14
 * ©2020
 *
 */

package bauernhofsimulator.tiere;

import bauernhofsimulator.futter.Futter;
import bauernhofsimulator.interfaces.Kaufbar;

public class Tier implements Kaufbar {
	private int alter;
	private double gewicht;
	private boolean hunger;
	private double preis;
	
	public Tier() {
		super();
	}

	public Tier(int alter, double gewicht, boolean hunger, double preis) {
		super();
		this.alter = alter;
		this.gewicht = gewicht;
		this.hunger = hunger;
		this.preis = preis;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
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
	
	public void fuettern(Futter futter) {
		
	}
	
	public void aufziehen() 
	{
		
	}

}
