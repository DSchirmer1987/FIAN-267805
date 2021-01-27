/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package oop_aufgabe2;

public class DreieckTest {

	public static void main(String[] args) {
		Dreieck dreieck = new Dreieck(new Punkt(), new Punkt(), new Punkt());
		System.out.println("Das Dreieck hat den Umfang "+ dreieck.umfang());
	}

}
