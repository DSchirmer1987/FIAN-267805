package kontrollstrukturen;

public class App {

	public static void main(String[] args) {
		/*
		 * Erzeugen eines Objektes vom Typ Rabattrecher(Unsere eigene Klasse)
		 */
		Rabattrechner rabattrechner = new Rabattrechner();
		
		/*
		 * Ausführen der Methode 'werteEingeben' unserer Klasse
		 */
		rabattrechner.werteEingeben();
		System.out.println(rabattrechner.ausrechnenGesamtpreis());
	}

}
