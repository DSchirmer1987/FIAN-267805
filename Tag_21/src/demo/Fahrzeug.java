/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package demo;

public abstract class Fahrzeug {
	private String farbe, modell, ps, tankgroesse;

	public Fahrzeug(String farbe, String modell, String ps, String tankgroesse) {
		this.farbe = farbe;
		this.modell = modell;
		this.ps = ps;
		this.tankgroesse = tankgroesse;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getTankgroesse() {
		return tankgroesse;
	}

	public void setTankgroesse(String tankgroesse) {
		this.tankgroesse = tankgroesse;
	}
	
	@Override
	public String toString() {
		return "Fahrzeug [farbe=" + farbe + ", modell=" + modell + ", ps=" + ps + ", tankgroesse=" + tankgroesse + "]";
	}
	
	public String fahren() {
		return this.getModell() + " fährt";
	}
	
	public String tanken() {
		return this.getModell() + " tankt";
	}

}
