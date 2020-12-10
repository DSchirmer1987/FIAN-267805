/**
 * Daniel Schirmer
 *
 * 10.12.2020
 * Project : Tag_12_MVC
 * ©2020
 *
 */

package mvcdemo.model;

public class Kuh {
	private String name;
	private String farbe;
	
	public Kuh(String name, String farbe) {
		super();
		this.name = name;
		this.farbe = farbe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	@Override
	public String toString() {
		return "Kuh [name=" + name + ", farbe=" + farbe + "]";
	}
}
