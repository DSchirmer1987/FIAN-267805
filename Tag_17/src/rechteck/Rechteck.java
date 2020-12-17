/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * �2020
 *
 */

package rechteck;

public class Rechteck {
	private int a;
	private int b;
	
	public Rechteck(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public float berechneUmfang() {
		return 2 * b + 2 * a;
	}
	
	public float berechneInhalt() {
		return a * b;
	}
}