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

public class BMIRechner {
	public float koerpergewicht;
	public float koerpergroesse;
	public byte alter;
	private Scanner sc;
	
	public float getKoerpergewicht() {
		return koerpergewicht;
	}
	public void setKoerpergewicht(float koerpergewicht) {
		this.koerpergewicht = koerpergewicht;
	}
	public float getKoerpergroesse() {
		return koerpergroesse;
	}
	public void setKoerpergroesse(float koerpergroesse) {
		this.koerpergroesse = koerpergroesse;
	}
	public byte getAlter() {
		return alter;
	}
	public void setAlter(byte alter) {
		this.alter = alter;
	}
	
	public BMIRechner() {
		this.alter = 0;
		this.koerpergewicht = 0.0f;
		this.koerpergroesse = 0.0f;
		this.sc = new Scanner(System.in);
	}
	
	public void werteEingeben() {
		System.out.println("Bitte Alter eingeben");
		this.alter = sc.nextByte();
		System.out.println("Bitte Körpergröße eingeben (in Metern)");
		this.koerpergroesse = sc.nextFloat();
		System.out.println("Bitte Körpergewicht eingeben (in Kg)");
		this.koerpergewicht = sc.nextFloat();
		this.sc.close();
	}
	
	public String BMIberechnung() {
		int bmi;
		String returnString = "";
		bmi = (int)(this.koerpergewicht / Math.pow(this.koerpergroesse, 2.0));
		if(alter > 18 && alter < 25) {
			if(bmi >= 19 && bmi <= 24) {
				returnString = "Alles in Ordnung";
			} else {
				returnString = "Der BMI ist ausserhalb der empholenen Werte";
			}
		}
		if(alter > 24 && alter < 35) {
			if(bmi >= 20 && bmi <= 25) {
				returnString = "Alles in Ordnung";
			} else {
				returnString = "Der BMI ist ausserhalb der empholenen Werte";
			}
		}
		if(alter > 34 && alter < 45) {
			if(bmi >= 21 && bmi <= 26) {
				returnString = "Alles in Ordnung";
			} else {
				returnString = "Der BMI ist ausserhalb der empholenen Werte";
			}
		}
		if(alter > 44 && alter < 55) {
			if(bmi >= 22 && bmi <= 27) {
				returnString = "Alles in Ordnung";
			} else {
				returnString = "Der BMI ist ausserhalb der empholenen Werte";
			}
		}
		if(alter > 54 && alter < 65) {
			if(bmi >= 23 && bmi <= 28) {
				returnString = "Alles in Ordnung";
			} else {
				returnString = "Der BMI ist ausserhalb der empholenen Werte";
			}
		}
		if(alter > 64) {
			if(bmi >= 24 && bmi <= 29) {
				returnString = "Alles in Ordnung";
			} else {
				returnString = "Der BMI ist ausserhalb der empholenen Werte";
			}
		}
		return returnString;
	}
	
}
