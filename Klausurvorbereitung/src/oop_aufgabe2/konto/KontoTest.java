/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package oop_aufgabe2.konto;

public class KontoTest {

	public static void main(String[] args) {
		Konto konto1 = new Konto ("Müller", "Hans", 500);
		Konto konto2 = new Konto ("Krause", "Peter", 1500);
		Konto konto3 = new Konto ("Böhm", "Harald", 330);
		kontoVergleich (konto1, konto2);
		kontoVergleich (konto2, konto3);
		kontoVergleich (konto1, konto3);

	}
	
	public static void kontoVergleich (Konto k1, Konto k2){
		if (k1.getKontostand() > k2.getKontostand()){
			System.out.println (k1.getPerson().getName() + " hat mehr Geld auf dem Konto als " + k2.getPerson().getName());
		} else if (k1.getKontostand() < k2.getKontostand()) {
			System.out.println (k2.getPerson().getName()+ " hat mehr Geld auf dem Konto als " + k1.getPerson().getName());
		} else {
			System.out.println (k2.getPerson().getName()+ " hat gleich viel Geld auf dem Konto wie " + k1.getPerson().getName());
		}
	}

}
