/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package demo;

public class Mercedes extends Fahrzeug{
	private String blinkerfarbe;
	
	public Mercedes(String farbe, String modell, String ps, String tankgroesse) {
		super(farbe, modell, ps, tankgroesse);
		// TODO Auto-generated constructor stub
	}

	public String getBlinkerfarbe() {
		return blinkerfarbe;
	}

	public void setBlinkerfarbe(String blinkerfarbe) {
		this.blinkerfarbe = blinkerfarbe;
	}

	@Override
	public String toString() {
		return "Mercedes [blinkerfarbe=" + blinkerfarbe + "]" + super.toString();
	}
	
	
}
