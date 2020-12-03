/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_06
 * ©2020
 *
 */

package aufgabe1;

public class Test {
	public static void main(String[] args) {
	// Adressen Werke und Empf‰nger
			Adresse werk1 = new Adresse("", "MyCar Werk", "Fabrikstraﬂe", 1, 10815, "Hintertupfingen");
			Adresse werk2 = new Adresse("", "Bonzo Werke", "Bonzo-Allee", 1, 76370, "Glitterbach");
			Adresse dealer1 = new Adresse("Hansi Scheffler", "Supi-Cars", "Am Schrottplatz", 2, 24567, "Dingelhausen");
			
			// MotorVehicles mit Testwerten
			MotorVehicle mv1 = new MotorVehicle(5.4, 1.65, 1.50, 850, "Quietschi 500", "Stefan Udent", werk1, dealer1);
			MotorVehicle mv2 = new MotorVehicle(6.6, 1.85, 1.70, 1650, "SuperBrumm 2000", "Richard Eich", werk2, null);
			// nur Defaultkonstruktor
			// MotorVehicle mv3 = new MotorVehicle();
			
			// Ausgabe der Fahrzeugdaten
			System.out.println();
			mv1.print();
			System.out.println();
			mv2.print();
			System.out.println();
			// mv3.print();
	}
}
