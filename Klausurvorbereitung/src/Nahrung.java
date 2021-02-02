// abstract = Keine Instanzierung m�glich
// abstract = M�glichkeit zur Implementierung von abstrakten Methoden
// Im Gegensatz zu Interfaces, auch die M�glichkeit f�r konkrete Methoden
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
