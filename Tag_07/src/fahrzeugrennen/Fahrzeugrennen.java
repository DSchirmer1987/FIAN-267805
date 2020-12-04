/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package fahrzeugrennen;

public class Fahrzeugrennen {

	public static void main(String[] args) {
		Fahrrad fahrrad = new Fahrrad();
		fahrrad.setGeschwindigkeit(20);
		fahrrad.bewegen( (4 * 60) );
		
		Auto auto = new Auto();
		auto.setGeschwindigkeit(150);
		
		Rennwagen rennwagen = new Rennwagen();
		rennwagen.setGeschwindigkeit(200);
		
		Krankenwagen krankenwagen = new Krankenwagen();
		krankenwagen.setGeschwindigkeit(80);
		
		fahrrad.bewegen(60);
		auto.bewegen(60);
		rennwagen.bewegen(60);
		krankenwagen.bewegen(60);
		
		System.out.println(fahrrad);
		System.out.println(auto);
		System.out.println(rennwagen);
		System.out.println(krankenwagen);
		
		/* 
		 * 
		 * */
		System.out.println("Mit Arrays:");
		
		Fahrzeug[] fahrzeuge = new Fahrzeug[4];
		fahrzeuge[0] = new Fahrrad();
		fahrzeuge[1] = new Auto();
		fahrzeuge[2] = new Rennwagen();
		fahrzeuge[3] = new Krankenwagen();
		
		fahrzeuge[0].setGeschwindigkeit(20);
		fahrzeuge[1].setGeschwindigkeit(150);
		fahrzeuge[2].setGeschwindigkeit(200);
		fahrzeuge[3].setGeschwindigkeit(80);
		
		fahrzeuge[0].bewegen((4*60));
		
		for (int i = 0; i < fahrzeuge.length; i++) {
			fahrzeuge[i].bewegen(60);
			System.out.println(fahrzeuge[i]);
		}
	}

}
