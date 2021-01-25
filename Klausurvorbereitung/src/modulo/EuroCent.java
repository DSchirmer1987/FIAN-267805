package modulo;

import java.util.Scanner;

public class EuroCent {

	public static void main(String[] args) {
		int eingabe, euro, cent;
//		Scanner für das einlesen von der Konsole
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Cent Betrag an:");
		eingabe = sc.nextInt();
//		Geteilt durch 100 für volle Euro
		euro = eingabe / 100;
		/*
		 * Beispiel 256
		 * 
		 * 100 passen 2 mal in die 256
		 * 
		 * 100
		 * 200 | 56
		 * 
		 * 256 / 100 = 2 Rest 56
		 * 
		 */
//		Modulo rechnet die normale Division und gibt den Rest aus.
		/*
		 *  256 / 100 = 
		 *  200 / 100 = 2 Rest 56
		 *   56	
		 */
		cent = eingabe % 100;
		
		
		System.out.println(eingabe + " Cent sind " + euro + " Euro und " + cent + " Cent");
	}

}
