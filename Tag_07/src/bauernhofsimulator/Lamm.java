/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package bauernhofsimulator;

public class Lamm extends Schaf {
	private String augenfarbe;

	public Lamm(String name, String farbe, double gewicht, String augenfarbe) {
		super(name, farbe, gewicht);
		this.augenfarbe = augenfarbe;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}

	@Override
	public String toString() {
		return "Lamm [augenfarbe=" + augenfarbe + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
}
