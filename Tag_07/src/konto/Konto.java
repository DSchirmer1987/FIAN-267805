/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package konto;

public class Konto {
	private Person person;
	private double kontostand;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	public Konto(String vorname, String nachname, double kontostand) {
		super();
		this.person = new Person(vorname, nachname);
		this.kontostand = kontostand;
	}
	
	
}
