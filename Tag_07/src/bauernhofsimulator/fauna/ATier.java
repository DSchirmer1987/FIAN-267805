/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package bauernhofsimulator.fauna;

import bauernhofsimulator.flora.APflanze;

public abstract class ATier {
	private String name;
	private String farbe;
	private double gewicht;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	public abstract void machGeraeusch();
	
	public abstract void fressen(APflanze planze);
	
}
