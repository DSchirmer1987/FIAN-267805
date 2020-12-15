/**
 * Daniel Schirmer
 *
 * 15.12.2020
 * Project : Tag_14
 * ©2020
 *
 */

package bauernhofsimulator.tiere;

import bauernhofsimulator.produkte.Wolle;

public class Schaf extends Tier {
	
	public Wolle scheren() {
		Wolle ausgabe = new Wolle();
		if(this.getAlter() > 5) {
			ausgabe.setPreis(50);
		} else if (this.getAlter() <= 5 && this.getAlter() >=2 ) {
			ausgabe.setPreis(25);
		}
		return ausgabe;
	}
}
