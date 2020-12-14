/**
 * Daniel Schirmer
 *
 * 24.07.2018
 * Project : LokalCopy
 * ©2018
 *
 */

package tag13.opvn;

public class Verkehrsmittel {
	private int linienNummer;
	private String fahrer, startHalteStelle, endHalteStelle;

	public Verkehrsmittel() {
		super();
	}

	public Verkehrsmittel(int linienNummer, String fahrer, String startHalteStelle, String endHalteStelle) {
		super();
		this.setLinienNummer(linienNummer);
		this.setFahrer(fahrer);
		this.setStartHalteStelle(startHalteStelle);
		this.setEndHalteStelle(endHalteStelle);
	}

	public int getLinienNummer() {
		return linienNummer;
	}

	public void setLinienNummer(int linienNummer) {
		this.linienNummer = linienNummer;
	}

	public String getFahrer() {
		return fahrer;
	}

	public void setFahrer(String fahrer) {
		if(fahrer == null || fahrer.length() < 1) {
			throw new IllegalArgumentException("Fahrername darf nicht leer sein!");
		}
		this.fahrer = fahrer;
	}

	public String getStartHalteStelle() {
		return startHalteStelle;
	}

	public void setStartHalteStelle(String startHalteStelle) {
		if(startHalteStelle == null || startHalteStelle.length() < 1) {
			throw new IllegalArgumentException("Starthaltestelle darf nicht leer sein!");
		}
		this.startHalteStelle = startHalteStelle;
	}

	public String getEndHalteStelle() {
		return endHalteStelle;
	}

	public void setEndHalteStelle(String endHalteStelle) {
		if(endHalteStelle == null || endHalteStelle.length() < 1) {
			throw new IllegalArgumentException("Endhaltestelle darf nicht leer sein!");
		}
		this.endHalteStelle = endHalteStelle;
	}

	@Override
	public String toString() {
		return "Verkehrsmittel [linienNummer=" + linienNummer + ", fahrer=" + fahrer + ", startHalteStelle="
				+ startHalteStelle + ", endHalteStelle=" + endHalteStelle + "]";
	}

	public boolean equals(Verkehrsmittel other) {
		return this.getLinienNummer() == other.getLinienNummer();
	}
	
	

}
