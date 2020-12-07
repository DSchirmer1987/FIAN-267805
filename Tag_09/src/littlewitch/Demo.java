/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_09
 * ©2020
 *
 */

package littlewitch;

public class Demo {

	public static void main(String[] args) {
		for (Clock clock : Clock.values()) {
			System.out.println(clock.getAusgabe());
		}
	}

}
