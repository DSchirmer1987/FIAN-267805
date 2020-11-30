/**
 * Daniel Schirmer
 *
 * 30.11.2020
 * Project : Tag_04
 * ©2020
 *
 */

package tag_04;

public class Schwein {
	// Attribute der Klasse
	public String name;
	private int alter;
	protected int gewicht;
	
	public Schwein(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void fressen() {
		System.out.println("Das Schwein frisst.");
	}
}
