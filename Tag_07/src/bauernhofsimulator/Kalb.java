/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package bauernhofsimulator;

public class Kalb extends Kuh {
	private int fleckengroesse;

	public Kalb(String name, String farbe, double gewicht, int fleckengroesse) {
		super(name, farbe, gewicht);
		this.fleckengroesse = fleckengroesse;
	}

	public int getFleckengroesse() {
		return fleckengroesse;
	}

	public void setFleckengroesse(int fleckengroesse) {
		this.fleckengroesse = fleckengroesse;
	}

	@Override
	public String toString() {
		return "Kalb [fleckengroesse=" + fleckengroesse + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
}
