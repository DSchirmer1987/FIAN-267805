package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayAufgaben {

	public static void main(String[] args) {
//		Array aus 10 Integer-Elementen
//		Datentyp[] Bezeichner = new Datentyp[Kapazität];
		int[] intArray = new int[10];
		// Random für Zufallswerte
		Random rnd = new Random();
		
		// Array befüllen mit den zahlen von 1-10
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i+1;
		}
		System.out.println("Mit von 1 - 10 befüllt");
		System.out.println(Arrays.toString(intArray));
		
		// Array befüllen mit den Zahlen von 10 - 1
		int counter = 0;
		for (int i = 10; i > 0; i--) {
			intArray[counter] = i;
			counter++;
		}
		System.out.println("Mit von 10 - 1 befüllt");
		System.out.println(Arrays.toString(intArray));
		
		// Array befüllen mit Zufallszahlen
		for (int i = 0; i < intArray.length; i++) {
//			intArray[i] = (int) (Math.random() * 10) + 1;
			intArray[i] = rnd.nextInt(10) + 1;
		}
		System.out.println("Mit von Zufallszahlen befüllt");
		System.out.println(Arrays.toString(intArray));
	}

}
