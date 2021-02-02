// abstract = Keine Instanzierung möglich
// abstract = Möglichkeit zur Implementierung von abstrakten Methoden
// Im Gegensatz zu Interfaces, auch die Möglichkeit für konkrete Methoden
public abstract class Nahrung {
	
	private String bezeichnung;
	
	public Nahrung() {
		this.bezeichnung = "Nahrung";
	}
	
	// Abstrakte Methode - Kein Methodenrumpf
	public abstract void essen();
	
	// Konkrete Methode - Mit Methodenrumpf
	public void fressen() {
		System.out.println("Fressen");
	}
	
}
