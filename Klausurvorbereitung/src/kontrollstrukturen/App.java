package kontrollstrukturen;

public class App {

	public static void main(String[] args) {
		/*
		 * Erzeugen eines Objektes vom Typ Rabattrecher(Unsere eigene Klasse)
		 */
		Rabattrechner rabattrechner = new Rabattrechner();
		
		/*
		 * Ausf�hren der Methode 'werteEingeben' unserer Klasse
		 */
		rabattrechner.werteEingeben();
		System.out.println(rabattrechner.ausrechnenGesamtpreis());
	}
	
	public static void prozedur() {
		System.out.println("Ich bin eine Prozedur");
	}

}
