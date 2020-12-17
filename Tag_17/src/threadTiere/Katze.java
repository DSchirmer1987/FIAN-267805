/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * ©2020
 *
 */

package threadTiere;

public class Katze extends Tier {

	public Katze(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}

	@Override
	public void laufen() {
		System.out.println("Katze" + this.getName() + " läuft!");
	}

}
