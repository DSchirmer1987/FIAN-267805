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
		
	public String getFahrzeugtyp() {
		return fahrzeugtyp;
	}

	public void setFahrzeugtyp(String fahrzeugtyp) {
		this.fahrzeugtyp = fahrzeugtyp;
	}

	public String getModellBezeichnung() {
		return modellBezeichnung;
	}

	public void setModellBezeichnung(String modellBezeichnung) {
		this.modellBezeichnung = modellBezeichnung;
	}

	public void print(){
		super.print();
		System.out.println("Fahrzeugtyp = " + this.fahrzeugtyp);
		System.out.println("Modellbezeichnung = " + this.modellBezeichnung);
	}
}
