/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package demo;

public class Harley extends Fahrzeug{
	private String fahrer;

	public Harley(String farbe, String modell, String ps, String tankgroesse) {
		super(farbe, modell, ps, tankgroesse);
		// TODO Auto-generated constructor stub
	}

	public String getFahrer() {
		return fahrer;
	}

	public void setFahrer(String fahrer) {
		this.fahrer = fahrer;
	}

	@Override
	public String toString() {
		return "Harley [fahrer=" + fahrer + "]" + super.toString();
	}

}
