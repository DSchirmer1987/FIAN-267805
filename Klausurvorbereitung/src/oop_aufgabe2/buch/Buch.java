/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package oop_aufgabe2.buch;

/**
 * Die Klasse die ein Buch repräsentiert
 * @author Berliner
 * @version 1.0
 * @since Januar 2021
 *
 */
public class Buch {
	private String titel;
	private String autor;
	private String verlag;
	private short seitenAnzahl;
	
	/**
	 * Der Konstruktor um ein Buch-Objekt zu instanzieren
	 * @param titel - Titel des Buches
	 * @param autor - Autor des Buches
	 * @param verlag - Verlag des Buches
	 * @param seitenAnzahl - SeitenAnzahl des Buches
	 */
	public Buch(String titel, String autor, String verlag, short seitenAnzahl) {
		super();
		this.titel = titel;
		this.autor = autor;
		this.verlag = verlag;
		this.seitenAnzahl = seitenAnzahl;
	}
	
	/**
	 * Gibt den Titel zurück
	 * @return - Buchtitel
	 */
	public String getTitel() {
		return titel;
	}
	 
	/**
	 * Setzt den Titel
	 * @param titel - Buchtitel
	 */
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	/**
	 * Gibt den Autor zurück
	 * @return - Buchautor
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Setzt den Autor
	 * @param autor - Buchautor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * Gibt den Verlag zurück
	 * @return - Buchverlag
	 */
	public String getVerlag() {
		return verlag;
	}
	
	/**
	 * Setzt den Verlag
	 * @param verlag - Buchverlag
	 */
	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}
	
	/**
	 * Gibt die SeitenAnzahl zurück
	 * @return - Seitenanzahl
	 */
	public int getSeitenAnzahl() {
		return seitenAnzahl;
	}
	
	/**
	 * Setzt die Seitenanzahl
	 * @param seitenAnzahl - Seitenanzahl
	 */
	public void setSeitenAnzahl(short seitenAnzahl) {
		this.seitenAnzahl = seitenAnzahl;
	}
	
	/**
	 * Überschreibt die toString von Object
	 */
	@Override
	public String toString() {
		return "Buch [titel=" + titel + ", autor=" + autor + ", verlag=" + verlag + ", seitenAnzahl=" + seitenAnzahl
				+ "]";
	}	
}
