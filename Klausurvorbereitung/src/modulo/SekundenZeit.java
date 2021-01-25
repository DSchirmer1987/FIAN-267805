package modulo;

import java.util.Scanner;

public class SekundenZeit {

	public static void main(String[] args) {
		int eingabe, sekunden, minuten, stunden, tage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte die Sekunden eingeben:");
		eingabe = sc.nextInt();
		
//		1 Tag = 86400 Sekunden
		tage = eingabe / 86400;
//		1 Stunde = 3600 Sekunden bzw. Rest von Tage / 3600
		stunden = (eingabe % 86400) / 3600;
//		1 Minute = 60 Sekunden bzw. Rest von Stunden / 60
		minuten = ((eingabe % 86400) % 3600) / 60;	
//		1 Sekunde = 1 Sekunde
		sekunden = eingabe % 60;



		
		System.out.println(eingabe +" Sekunden sind "+tage+" Tag(e) , "+stunden+" Stunde(n), "+minuten+" Minute(n) und "+sekunden+" Sekunde(n).");
	}

}
