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
		
		// Berechnen der Summe aller Zahlen im Array
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.println("Summe aller Zahlen");
		System.out.println(sum);
		
		// Berechnen des Mittelwertes aller Zahlen im Array
		double average = 0;
		average = (double) sum / (double) intArray.length;
		System.out.println("Mittelwert aller Zahlen");
		System.out.println(average);
		
		// Kleinste Zahl im Array
		int min = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(min > intArray[i]) {
				min = intArray[i];
			}
		}
		System.out.println("Kleinste Zahl");
		System.out.println(min);
		
		// Größte Zahl im Array
		int max = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("Größte Zahl");
		System.out.println(max);
		
		// Vertauschen / Umdrehen des Arrays
		int[] intArray2 = new int[10];
		counter = 0;
		for (int i = 9; i >= 0; i--) {
			intArray2[counter] = intArray[i];
			counter++;
		}
		System.out.println(Arrays.toString(intArray));
		System.out.println("Umgedrehtes Array");
		System.out.println(Arrays.toString(intArray2));
		
		// Vertauschen / Umdrehen des Arrays ohne extra-Array
		int tmp;
		for (int i = 0; i < intArray.length / 2 ; i++) {
			tmp = intArray[i];
			intArray[i] = intArray[(intArray.length-1) - i];
			intArray[(intArray.length-1) - i] = tmp;
		}
		System.out.println("Umgedrehtes Array ohne extra Array");
		System.out.println(Arrays.toString(intArray2));
	}

}
