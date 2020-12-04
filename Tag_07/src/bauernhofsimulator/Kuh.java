/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package bauernhofsimulator;

import bauernhofsimulator.fauna.ATier;
import bauernhofsimulator.flora.APflanze;

public class Kuh extends ATier{
	public Kuh(String name, String farbe, double gewicht) {
		this.setName(name);
		this.setFarbe(farbe);
		this.setGewicht(gewicht);
	}
	
	@Override
	public String toString() {
		return "Kuh [getName()=" + getName() + ", getFarbe()=" + getFarbe() + ", getGewicht()=" + getGewicht() + "]";
	}

	@Override
	public void machGeraeusch() {
		System.out.println("Muh!");
	}

	@Override
	public void fressen(APflanze pflanze) {
		pflanze.wirdGefressen();
	}
}
