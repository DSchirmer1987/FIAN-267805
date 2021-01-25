package sum;

public class Produkt {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der multipliziert wird
	int boundary;
	// Produkt der bisher addierten ganzen Zahlen
	int produkt;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;
	// Festlegen der Startwerte der Variablen
	boundary = 4;
	produkt = 1;
	counter = 1;
	// Berechnen des Produktes sum über alle Zahlen von 1 bis boundary
	while (counter <= boundary) {
		produkt = produkt * counter;
		counter = counter + 1;
	}
	// Ausgeben des Produkt, gemeinsam mit erlÃ¤uterndem Text
	System.out.print("Das Produkt der Zahlen von 1 bis ");
	System.out.print(boundary);
	System.out.print(" ist ");
	System.out.println(produkt);
	}
}

