import java.util.Scanner;

/**
 * Daniel Schirmer
 *
 * 01.12.2020
 * Project : Tag_05
 * ©2020
 *
 */

public class PirateSpeechGenerator {
	public String eingabe;
	private Scanner sc;
	
	public String getEingabe() {
		return eingabe;
	}
	public void setEingabe(String eingabe) {
		this.eingabe = eingabe;
	}
	
	public PirateSpeechGenerator() {
		this.eingabe = "";
		this.sc = new Scanner(System.in);
	}
	
	public void einlesen() {
		System.out.println("Bitte einen Text eingeben:");
		this.eingabe = sc.nextLine();
//		this.sc.close();
	}
	
	public String pirateSpeech() {
		String ausgabe = "";
		ausgabe = this.eingabe.replace("a", "arr");
		ausgabe = ausgabe.replace("e", "err");
		ausgabe = ausgabe.replace("i", "irr");
		ausgabe = ausgabe.replace("o", "orr");
		ausgabe = ausgabe.replace("u", "urr");
		return ausgabe;
	}
	
	public void ausgebenBisEnde() {
		while(!this.eingabe.equals("Ende")) {
			this.einlesen();
			System.out.println(pirateSpeech());
		}
		System.out.println("Programm Ende");
	}
	
	public static void pirate() {
		System.out.println("Arr");
	}
	
}
