/**
 * Daniel Schirmer
 *
 * 15.12.2020
 * Project : Tag_14
 * ©2020
 *
 */

package bauernhofsimulator.tiere;

import java.util.Random;

import bauernhofsimulator.produkte.Milch;

public class Kuh extends Tier {
	
	public Milch melken() {
		Milch ausgabe = new Milch();
		Random random = new Random();
		ausgabe.setPreis(random.nextInt(30) + 1);
		return ausgabe;
	}
}
