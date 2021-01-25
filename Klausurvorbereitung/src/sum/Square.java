package sum;

public class Square {

	public static void main(String[] args) {
//		Deklaration der Variablen
		int number;
		int counter;
		int boundary;
		int result;
//		Initialisierung der Variablen
		number = 11;
		counter = 1;
		result = 0;
		boundary = number;
		
		System.out.println("Das Quadrat von  " + number + " ist:");
		
		// n-maliges addieren
		while (counter <= boundary) {
			result = result + number;
			counter = counter + 1;
		}
		System.out.println(" - Berechnet durch " + number + "-maliges addieren von " + number + ": " + result);
		
		// Summe der n positiven ungeraden Zahlen
		result = 0;
		counter = 1;
//		Variable für ungerade Zahlen
		int uneven = 1;
		while (counter <= boundary) {
//			Berechnung über die Addition der Ungeraden zahlen
			result = result + uneven;
			counter = counter + 1;
//			Erhöhung auf die nächste Ungerade Zahl
			uneven = uneven + 2;
		}
		System.out.println(" - Berechnet als Summe der ersten  " + number + " ganzen Zahlen:" + result);
		
		// Multiplikation
		result = number * number;
		System.out.println(" - Berechnet als Multiplikation: " + result);
	}

}
