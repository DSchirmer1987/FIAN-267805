package oop;

/**
 * Diese Klasse beschreibt ein einfaches Auto
 */

public class Auto {
	private String name;
	private int ps;
	
	/**
	 * Der Getter f�r das Attribut "Name"
	 * @return - Name des Autos
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Der Setter f�r das Attribute "Name"
	 * @param name - Der Name f�r das Auto
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ps
	 */
	public int getPs() {
		return ps;
	}

	/**
	 * @param ps the ps to set
	 */
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	/**
	 * Der Default-Konstruktor f�r das Auto
	 */
//	public Auto() {
//		this.setName("VW");
//		this.setPs(150);
//	}
	
	/**
	 * Der parametrisiere Konstruktor f�r das Auto
	 * @param name - String f�r den Name
	 * @param ps - Integer f�r die PS
	 */
	public Auto(String name, int ps) {
		this.setName(name);
		this.setPs(ps);
	}
	
	/**
	 * Der Kopier-Konstruktor f�r das Auto
	 * @param auto - Das Auto das kopiert werden soll
	 */
	public Auto(Auto auto) {
		this.setName(auto.getName());
		this.setPs(auto.getPs());
	}

	@Override
	public String toString() {
		return "Auto [getName()=" + getName() + ", getPs()=" + getPs() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		if(this.getName() == ((Auto) obj).getName()) {
			equal = true;
		}
		return equal;
	}
	
//	Eigene Methoden
	public String fahren() {
		return "Das Auto f�hrt";
	}
	
	
}
