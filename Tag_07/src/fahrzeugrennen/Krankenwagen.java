/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package fahrzeugrennen;

public class Krankenwagen extends Auto {
	private boolean blaulicht;
	
	public Krankenwagen() {
		super();
		this.setBezeichnung("Krankenwagen");
	}

	public boolean isBlaulicht() {
		return blaulicht;
	}

	public void setBlaulicht(boolean blaulicht) {
		this.blaulicht = blaulicht;
	}

	@Override
	public String toString() {
		return "Krankenwagen [blaulicht=" + blaulicht + ", getPosition()=" + getPosition() + ", getGeschwindigkeit()="
				+ getGeschwindigkeit() + ", getMaxGeschwindigkeit()=" + getMaxGeschwindigkeit() + ", getAnzahlRaeder()="
				+ getAnzahlRaeder() + ", getBezeichnung()=" + getBezeichnung() + "]";
	}
}
