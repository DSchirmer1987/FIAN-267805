/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_09
 * ©2020
 *
 */

package enumdemo;

public enum Bechergroesse {
	Klein(125), Mittel(250), Gross(750);
	
	private final int size;

	Bechergroesse(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}
}
