package kontrollstrukturen;
import java.util.Scanner;

/**
 * Daniel Schirmer
 *
 * 01.12.2020
 * Project : Tag_05
 * ©2020
 *
 */

public class Rabattrechner {
	public int stueckzahl;
	public float einzelpreis;
	private Scanner sc;
	
	public int getStueckzahl() {
		return stueckzahl;
	}
	public void setStueckzahl(int stueckzahl) {
		this.stueckzahl = stueckzahl;
	}
	public float getEinzelpreis() {
		return einzelpreis;
	}
	public void setEinzelpreis(float einzelpreis) {
		this.einzelpreis = einzelpreis;
	}
	
	public Rabattrechner() {
		this.einzelpreis = 0.0f;
		this.stueckzahl = 0;
		this.sc = new Scanner(System.in);
	}
	
	public void werteEingeben() {
		System.out.println("Bitte Stückzahl eingeben:");
		this.stueckzahl = sc.nextInt();
		System.out.println("Bitte Einzelpreis eingeben");
		this.einzelpreis = sc.nextFloat();
		sc.close();
	}
	
	public String ausrechnenGesamtpreis() {
		String returnString = "";
		float gesamtpreis = this.stueckzahl * this.einzelpreis;
		if(this.stueckzahl < 10) {
			gesamtpreis = gesamtpreis;
		} else if (this.stueckzahl >= 10 && this.stueckzahl < 50) {
			gesamtpreis = gesamtpreis * 0.95f;
		} else {
			gesamtpreis = gesamtpreis * 0.90f;
		}
		returnString = "Der Gesamtpreis beträgt " + gesamtpreis + " Euro";
		return returnString;
	}
	
}
