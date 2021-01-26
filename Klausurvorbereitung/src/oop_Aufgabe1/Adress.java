/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_06
 * ©2020
 *
 */

package oop_Aufgabe1;

public class Adress {
	private String vorname;
	private String nachname;
	private String strasse;
	private int hausnummer;
	private int plz;
	private String ort;
	
	public Adress() {
		super();
		this.vorname = "Max";
		this.nachname = "Mustermann";
		this.strasse = "Musterstraße";
		this.hausnummer = 1;
		this.plz = 12345;
		this.ort = "Musterhausen";
	}

	public Adress(String vorname, String nachname, String strasse, int hausnummer, int plz, String ort) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return "Adresse [vorname=" + vorname + ", nachname=" + nachname + ", strasse=" + strasse + ", hausnummer="
				+ hausnummer + ", plz=" + plz + ", ort=" + ort + "]";
	};
	
	public String printAddress() {
		return ""+this.getVorname()+" "+this.getNachname()+" "+this.getStrasse()+""+this.getHausnummer()+" "+this.getPlz()+" "+this.getOrt()+">\n";
	}
}
