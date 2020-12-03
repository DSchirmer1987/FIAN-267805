/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package buch;

public class BuchTest {

	public static void main(String[] args) {
		Buch b1 = new Buch("ES", "Stephen King", "Heyne", (short) 1214);
		Buch b2 = new Buch("Krabat", "Otfried Preuﬂler", "Thienemann", (short) 256);
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
