/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * �2020
 *
 */

package bauernhofsimulator;

public class Schwein {
	private String name;
	private String farbe;
	private double gewicht;
	
	public Schwein(String name, String farbe, double gewicht) {
		super();
		this.name = name;
		this.farbe = farbe;
		this.gewicht = gewicht;
	}

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

	@Override
	public String toString() {
		return "Schwein [name=" + name + ", farbe=" + farbe + ", gewicht=" + gewicht + "]";
	}
}
