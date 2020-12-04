/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * �2020
 *
 */

package vererbung;

public class FahrzeugTest {
	public static void main (String args[]){
		System.out.println ("Start des Programms");
		// Anlegen eines Arrays aus 6 Fahrzeugen
		Fahrzeug[] fahrzeuge = new Fahrzeug[6];
		// Die ersten 3 Elemente des Arrays sollen mit Pkws gef�llt werden
		System.out.println();
		System.out.println ("3 Pkws");
		fahrzeuge[0] = new Pkw();
		fahrzeuge[1] = new Pkw();
		fahrzeuge[2] = new Pkw();
		// Die drei letzten Elemente mit Motorr�dern f�llen
		System.out.println();
		System.out.println ("3 Motorr�der");
		fahrzeuge[3] = new Motorrad();
		fahrzeuge[4] = new Motorrad();
		fahrzeuge[5] = new Motorrad();
		// Geben Sie in einer Schleife f�r alle Array-Elemente die
		// entsprechenden Datenfelder aus
		float summe = 0;
		for(int i=0; i < fahrzeuge.length ; i++) {
			fahrzeuge[i].print();
			summe = summe + fahrzeuge[i].getPreis();
			System.out.println();
		}
		// Ermittlung des Gesamtwerts aller Fahrzeuge
		System.out.println ("\n\nGesamtwert aller Fahrzeuge: " + summe);
	}
}
