/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package vererbung;

public class Motorrad extends Fahrzeug{
	private String fahrzeugtyp = "Motorrad";
	
	public Motorrad() {
		super();
	}
	
	public String getFahrzeugtyp() {
		return fahrzeugtyp;
	}

	public void setFahrzeugtyp(String fahrzeugtyp) {
		this.fahrzeugtyp = fahrzeugtyp;
	}

	public void print(){
		super.print();
		System.out.println("Fahrzeugtyp = " + this.fahrzeugtyp);
	}
}
