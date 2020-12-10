/**
 * Daniel Schirmer
 *
 * 10.12.2020
 * Project : Tag_12_FahrscheinAutomat
 * ©2020
 *
 */

package fahrscheinautomat.controller;

import java.util.Arrays;

import fahrscheinautomat.model.Fahrschein;
import fahrscheinautomat.model.Fahrscheinautomat;

public class ConsoleController {
	Fahrscheinautomat fa = new Fahrscheinautomat();
	
	public ConsoleController() {
		this.fa.addFahrschein(new Fahrschein('A', 230));
		this.fa.bezahlen(230, 250);
		System.out.println(this.fa);
		System.out.println(this.fa.getGeldEinwurfCent());
		System.out.println(this.fa.getRestGeldCent());
		System.out.println(this.fa.getWechselGeldCent());
		System.out.println(this.fa.isBezahlt());
		System.out.println(Arrays.toString(this.fa.getMuenzen()));
	}
}
