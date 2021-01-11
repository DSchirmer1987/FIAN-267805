/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package demo;

public class Honda extends Fahrzeug{
	private String spoiler;
	
	public Honda(String farbe, String modell, String ps, String tankgroesse) {
		super(farbe, modell, ps, tankgroesse);
		// TODO Auto-generated constructor stub
	}

	public String getSpoiler() {
		return spoiler;
	}

	public void setSpoiler(String spoiler) {
		this.spoiler = spoiler;
	}

	@Override
	public String toString() {
		return "Honda [spoiler=" + spoiler + "]" + super.toString();
	}
	

}
