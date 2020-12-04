/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package fahrzeugrennen;

public class Fahrzeug {
	private double position;
	private int geschwindigkeit;
	private int maxGeschwindigkeit;
	private int anzahlRaeder;
	private String bezeichnung;
	
	public Fahrzeug() {
		super();
		this.position = 0;
		this.geschwindigkeit = 0;
		this.maxGeschwindigkeit = 0;
		this.anzahlRaeder = 0;
		this.bezeichnung = "Basis Fahrzeug";
	}

	public Fahrzeug(double position, int geschwindigkeit) {
		super();
		this.position = position;
		this.geschwindigkeit = geschwindigkeit;
		this.maxGeschwindigkeit = 0;
		this.anzahlRaeder = 0;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(int geschwindigkeit) {
		if(geschwindigkeit < this.maxGeschwindigkeit) {
			this.geschwindigkeit = geschwindigkeit;
		} else {
			this.geschwindigkeit = this.maxGeschwindigkeit;
		}
	}
	
	public int getMaxGeschwindigkeit() {
		return maxGeschwindigkeit;
	}

	public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}
	
	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	@Override
	public String toString() {
		return "Fahrzeug [position=" + position + ", geschwindigkeit=" + geschwindigkeit + ", maxGeschwindigkeit="
				+ maxGeschwindigkeit + ", anzahlRaeder=" + anzahlRaeder + ", bezeichnung=" + bezeichnung + "]";
	}

	public void bewegen(int minuten) {
		if(this.geschwindigkeit > 0) {
			this.setPosition(((minuten / 60) * this.geschwindigkeit) + this.position);
		}
	}
}
