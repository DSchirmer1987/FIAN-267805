/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package bauernhofsimulator;

public class Ferkel extends Schwein {
	private int ohrenGroesse;

	public Ferkel(String name, String farbe, double gewicht, int ohrenGroesse) {
		super(name, farbe, gewicht);
		this.ohrenGroesse = ohrenGroesse;
	}

	public int getOhrenGroesse() {
		return ohrenGroesse;
	}

	public void setOhrenGroesse(int ohrenGroesse) {
		this.ohrenGroesse = ohrenGroesse;
	}

	@Override
	public String toString() {
		return "Ferkel [ohrenGroesse=" + ohrenGroesse + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
	
	
}
