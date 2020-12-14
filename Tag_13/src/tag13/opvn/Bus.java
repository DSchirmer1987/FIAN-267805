/**
 * Daniel Schirmer
 *
 * 24.07.2018
 * Project : LokalCopy
 * ©2018
 *
 */

package tag13.opvn;


public class Bus extends Verkehrsmittel {
	private int sitzplaetze;

	public Bus() {
		super();
	}

	public Bus(int linienNummer, String fahrer, String startHalteStelle, String endHalteStelle, int sitzplaetze) {
		super(linienNummer, fahrer, startHalteStelle, endHalteStelle);
		this.setSitzplaetze(sitzplaetze);
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}

	@Override
	public String toString() {
		return "Bus [getSitzplaetze()=" + getSitzplaetze() + ", getLinienNummer()=" + getLinienNummer()
				+ ", getFahrer()=" + getFahrer() + ", getStartHalteStelle()=" + getStartHalteStelle()
				+ ", getEndHalteStelle()=" + getEndHalteStelle() + "]";
	}
	
	
}
