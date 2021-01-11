import demo.BMW;
import demo.Fahrzeug;
import wiederholung.Kalb;
import wiederholung.Kuh;

/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

public class argsDemo {

	public static void main(String[] args) {
		Kuh k1;
		Kuh k2;
		k1 = new Kuh("Berta", "braun");
		k2 = new Kuh("Berta", "braun");
		for (String string : args){
			if(string.equals("config")) {
				System.out.println("Konfiguration.");
			} else {
				System.out.println("Kein Argument.");
			}
		}
		//k2 = k1;
		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));
		System.out.println("--------------");
		
		int zahl1 = 1;
		int zahl2 = 1;
		Integer zahl3 = 1;
		System.out.println(zahl1 == zahl2);
		System.out.println(zahl3.equals(zahl1));
		
		Kalb kalb3;
		kalb3 = new Kalb("Berta", "braun");
		System.out.println(k1.equals(kalb3));
		System.out.println("--------------");
		
		BMW f1 = new BMW("Blau", "Passat", "150", "60", "Sennheiser");
		System.out.println(f1.fahren());
	}

}
