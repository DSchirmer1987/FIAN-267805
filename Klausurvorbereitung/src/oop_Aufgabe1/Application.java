/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_06
 * �2020
 *
 */

package oop_Aufgabe1;

public class Application {
	public String attribut1 = "Hallo";
	public static String attribut2 = "Welt";
	
	public static void main(String[] args) {
		Adress adress1 = new Adress("Autohersteller", "", "Autoplatz", 1, 11111, "Autostadt");
		Adress adress2 = new Adress("Eva", "Musterautohaus", "Milchstra�e", 14, 90234, "Galazien");
		Adress adress3 = new Adress("Peter", "Musterautohaus", "Marktplatz", 2, 80888, "M�nchen");
		Adress adress4 = new Adress("Luca", "Musterautohaus", "Spielstra�e", 15, 76543, "Bretterbach");
		
		MotorVehicle mv1 = new MotorVehicle(150, 150, 300, 1300, "JEEP", "Eva" ,adress1, adress2);
		MotorVehicle mv2 = new MotorVehicle(130, 130, 350, 1100, "SPORTSCAR", "Eva" ,adress1, adress4);
		MotorVehicle mv3 = new MotorVehicle(178, 150, 453, 1400, "", "Eva" ,adress1, adress3);
		
		System.out.println(mv1);
		System.out.println(mv2);
		System.out.println(mv3);
		
		String text = "Java is eine Insel";
		System.out.println(text);
		text = text.replace('e', 'o');
		System.out.println(text);
		
		String name = "Anna";
		String name2 = "Berta";
		
		String zahl = "128";
		int nummer = Integer.parseInt(zahl);
		
		System.out.println(name.compareTo(name2));
		System.out.println(name2.compareTo(name));
		
		statMethod();
	}
	
	public static void statMethod() {
		System.out.println(attribut2);
	}
}
