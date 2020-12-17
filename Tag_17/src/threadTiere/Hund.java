/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * ©2020
 *
 */

package threadTiere;

public class Hund extends Tier {

	public Hund(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void laufen() {
		System.out.println("Hund " + this.getName() + " läuft!");

	}

}
