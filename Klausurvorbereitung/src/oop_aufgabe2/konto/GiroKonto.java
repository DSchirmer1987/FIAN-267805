package oop_aufgabe2.konto;

/**
 * 
 * @author Berliner
 * extends = Erben / erweitern
 * d.h. Unsere Klasse erbt von einer anderen
 */
public class GiroKonto extends Konto{

	public GiroKonto(String vorname, String nachname, double kontostand) {
		super(vorname, nachname, kontostand);	
	}

}
