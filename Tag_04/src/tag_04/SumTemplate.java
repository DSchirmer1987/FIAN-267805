package tag_04;


public class SumTemplate {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int boundary;
	// Summe der bisher addierten ganzen Zahlen
	int sum;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;
	// Festlegen der Startwerte der Variablen
	boundary = 6;
	sum = 0;
	counter = 1;
	// Berechnen der Summe sum über alle Zahlen von 1 bis boundary
//	while (counter <= boundary) {
//		if(counter % 2 != 0) {
//			sum = sum + counter;
//		}
//		counter = counter + 1;
//	}
	
	for (; counter <= boundary; counter++) {
		if(counter % 2 != 0) {
			sum = sum + counter;
		}
	}
	// Ausgeben der Summe, gemeinsam mit erlÃ¤uterndem Text
	System.out.print("Die Summe der ungeraden Zahlen von 1 bis ");
	System.out.print(boundary);
	System.out.print(" ist ");
	System.out.println(sum);
	}
}
