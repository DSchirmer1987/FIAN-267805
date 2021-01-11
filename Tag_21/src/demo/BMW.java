/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package demo;

public class BMW extends Fahrzeug{
	private String radioModell;

	public BMW(String farbe, String modell, String ps, String tankgroesse, String radioModell) {
		super(farbe, modell, ps, tankgroesse);
		this.radioModell = radioModell;
	}

	public String getRadioModell() {
		return radioModell;
	}

	public void setRadioModell(String radioModell) {
		this.radioModell = radioModell;
	}

	@Override
	public String toString() {
		return "BMW [radioModell=" + radioModell + "]" + super.toString();
	}
	
	
	
}
