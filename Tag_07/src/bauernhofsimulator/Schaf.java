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

public class Schaf extends ATier{
	public Schaf(String name, String farbe, double gewicht) {
		this.setName(name);
		this.setFarbe(farbe);
		this.setGewicht(gewicht);
	}

	@Override
	public String toString() {
		return "Schaf [getName()=" + getName() + ", getFarbe()=" + getFarbe() + ", getGewicht()=" + getGewicht() + "]";
	}

	@Override
	public void machGeraeusch() {
		System.out.println("Mäh!");	
	}

	@Override
	public void fressen(APflanze pflanze) {
		pflanze.wirdGefressen();
	}
}
