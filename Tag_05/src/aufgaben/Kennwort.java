/**
 * Daniel Schirmer
 *
 * 02.12.2020
 * Project : Tag_05
 * ©2020
 *
 */

package aufgaben;

import java.util.Scanner;

public class Kennwort {
	public String eingabe;
	private Scanner sc;
	
	public Kennwort() {
		this.eingabe = "";
		this.sc = new Scanner(System.in);
	}
	
	public void einlesen() {
		System.out.println("Bitte ein Passwort eingeben");
		this.eingabe = sc.nextLine();
	}
	
	public void kennwortPruefen() {
//		System.out.println(this.laengePruefen());
		if(this.upperLetterCheck() && this.digitCheck() && this.lengthCheck() && this.lowerCaseCheck() && this.specialCharacterCheck()) {
			System.out.println("Passwort is okay");
		} else {
			System.out.println("Passwort is nicht okay");
		}
	}
	
	public String laengePruefen() {
		if(this.eingabe.length() >= 10) {
			return "Passwortlänge ist okay.";
		} else {
			return "Passwort ist zu kurz. Es fehlen " + (10 - this.eingabe.length()) + " Zeichen";
		}
	}
	
	public boolean lengthCheck() {
		boolean lenght = false;
		if(this.eingabe.length() >= 10) {
			lenght = true;
		}
		return lenght;
	}
	
	public boolean upperLetterCheck() {
		boolean upperLetter = false;
		for(int i = 0; i < this.eingabe.length(); i++) {
			if(Character.isUpperCase(this.eingabe.charAt(i))) {
				upperLetter = true;
			}
		}
		return upperLetter;
	}
	
	public boolean digitCheck() {
		boolean digit = false;
		for(int i = 0; i < this.eingabe.length(); i++) {
			if(Character.isDigit(this.eingabe.charAt(i))) {
				digit = true;
			}
		}
		return digit;
	}
	
	public boolean lowerCaseCheck() {
		boolean lowerLetter = false;
		for(int i = 0; i < this.eingabe.length(); i++) {
			if(Character.isLowerCase(this.eingabe.charAt(i))) {
				lowerLetter = true;
			}
		}
		return lowerLetter;
	}
	
	public boolean specialCharacterCheck() {
		boolean specialCharacter = false;
		for(int i = 0; i < this.eingabe.length(); i++) {
			if(!Character.isLetter(this.eingabe.charAt(i)) && !Character.isDigit(this.eingabe.charAt(i))) {
				specialCharacter = true;
			}
		}
		return specialCharacter;
	}
}
