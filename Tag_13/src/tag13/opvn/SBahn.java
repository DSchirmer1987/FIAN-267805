/**
 * Daniel Schirmer
 *
 * 24.07.2018
 * Project : LokalCopy
 * ©2018
 *
 */

package tag13.opvn;

public class SBahn extends Verkehrsmittel {
	private String schaffner;
	private int wagenanzahl, sitzplatzwagen;

	public SBahn() {
		super();
	}

	public SBahn(int linienNummer, String fahrer, String startHalteStelle, String endHalteStelle, String schaffner,
			int wagenanzahl, int sitzplatzwagen) {
		super(linienNummer, fahrer, startHalteStelle, endHalteStelle);
		this.setSchaffner(schaffner);
		this.setWagenanzahl(wagenanzahl);
		this.setSitzplatzwagen(sitzplatzwagen);
	}

	public String getSchaffner() {
		return schaffner;
	}

	public void setSchaffner(String schaffner) {
		if(schaffner == null || schaffner.length() < 1) {
			throw new IllegalArgumentException("Schaffner darf nicht leer sein!");
		}
		this.schaffner = schaffner;
	}

	public int getWagenanzahl() {
		return wagenanzahl;
	}

	public void setWagenanzahl(int wagenanzahl) {
		this.wagenanzahl = wagenanzahl;
	}

	public int getSitzplatzwagen() {
		return sitzplatzwagen;
	}

	public void setSitzplatzwagen(int sitzplatzwagen) {
		this.sitzplatzwagen = sitzplatzwagen;
	}

	@Override
	public String toString() {
		return "SBahn [getSchaffner()=" + getSchaffner() + ", getWagenanzahl()=" + getWagenanzahl()
				+ ", getSitzplatzwagen()=" + getSitzplatzwagen() + ", getLinienNummer()=" + getLinienNummer()
				+ ", getFahrer()=" + getFahrer() + ", getStartHalteStelle()=" + getStartHalteStelle()
				+ ", getEndHalteStelle()=" + getEndHalteStelle() + "]";
	}
	
	

}
