/**
 * Daniel Schirmer
 *
 * 02.12.2020
 * Project : Tag_06
 * ©2020
 *
 */

public class BMW extends Auto implements java.io.Serializable{
	public String farbe;

	public BMW() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BMW(double laenge) {
		System.out.println("Double");
	}
	
	public BMW(BMW bmw) {
		this.farbe = bmw.farbe;
	}
	
	public BMW(float laenge) {
		System.out.println("Float");
	}

	public BMW(String name, int reifenAnzahl) {
		super(name, reifenAnzahl);
		this.farbe = "Schwarz";
	}

	public BMW(String name, int reifenAnzahl, String farbe) {
		super(name, reifenAnzahl);
		this.farbe = farbe;
	}
	
	// Methoden überladung ist möglich wenn die Parameter sich in
	// - Art
	// - Reihenfolge
	// - Anzahl
	// (ARA) unterscheiden.
	public void fahren() {
		
	}
	
	public void fahren(float strecke) {
		
	}
	
	public void fahren(float strecke, int personen) {
		
	}
	
	public void fahren(int personen, float strecke) {
		
	}
	
	public void fahren(int personen) {
		
	}
	
	
	
	
}
