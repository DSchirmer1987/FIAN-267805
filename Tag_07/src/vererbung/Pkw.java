/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package vererbung;

public class Pkw extends Fahrzeug {
	private String fahrzeugtyp = "Pkw";
	private String modellBezeichnung;
	
	public Pkw(){
		super();
		System.out.print("Geben Sie die Modellbezeichnung ein: ");
		modellBezeichnung = scanner.next();
	}
	
	public void print(){
		
	}
}
