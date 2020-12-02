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

public class StringAufgaben {
	public String vorname;
	public String nachname;
	public String name;
	public String kuerzel;
	
	public StringAufgaben() {
		this.vorname = "Daniel";
		this.nachname = "Schirmer";
		this.name = this.vorname + " " + this.nachname;
		this.kuerzel = Character.toString(vorname.charAt(0))+Character.toString(nachname.charAt(0)); 
	}
	
	public String ausgabe() {
		return "Vorname("+this.vorname.length()+"): " + this.vorname + " Nachname("+this.nachname.length()+"): " + this.nachname + " Voller Name("+this.name.length()+"): " + this.name + " Kuerzel: " + this.kuerzel;
	}
	
	public void einlesenUndAusgeben() {
		Scanner sc = new Scanner(System.in);
		String eingabe = sc.nextLine();
		for(int i = 0; i < eingabe.length(); i++) {
			System.out.print( (int) eingabe.charAt(i) + " " );
		}
	}
}
