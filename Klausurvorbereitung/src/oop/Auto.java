package oop;

/**
 * Diese Klasse beschreibt ein einfaches Auto
 */

public class Auto {
	private String name;
	private int ps;
	
	/**
	 * Der Getter für das Attribut "Name"
	 * @return - Name des Autos
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Der Setter für das Attribute "Name"
	 * @param name - Der Name für das Auto
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
	 * Der Default-Konstruktor für das Auto
	 */
//	public Auto() {
//		this.setName("VW");
//		this.setPs(150);
//	}
	
	/**
	 * Der parametrisiere Konstruktor für das Auto
	 * @param name - String für den Name
	 * @param ps - Integer für die PS
	 */
	public Auto(String name, int ps) {
		this.setName(name);
		this.setPs(ps);
	}
	
	/**
	 * Der Kopier-Konstruktor für das Auto
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
		return "Das Auto fährt";
	}
	
	
}
