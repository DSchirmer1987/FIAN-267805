/**
 * Daniel Schirmer
 *
 * 30.11.2020
 * Project : Tag05
 * ©2020
 *
 */

public class EuroCent {
	int eingabe;
	int euro;
	int cent;
	
	public int getEingabe() {
		return eingabe;
	}
	public void setEingabe(int eingabe) {
		this.eingabe = eingabe;
	}
	public int getEuro() {
		return euro;
	}
	public void setEuro(int euro) {
		this.euro = euro;
	}
	public int getCent() {
		return cent;
	}
	public void setCent(int cent) {
		this.cent = cent;
	}
	
	public EuroCent(int eingabe) {
		this.eingabe = eingabe;
		this.euro = 0;
		this.cent = 0;
	}
	
	public void umrechnen() {
		this.euro = eingabe / 100;
		this.cent = eingabe % 100;
	}
	
	public String toString() {
		return this.eingabe +  " cent ergeben: " + this.euro + " Euro und " + this.cent + " Cent";
	}
}
