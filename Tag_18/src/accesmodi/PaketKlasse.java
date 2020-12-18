/**
 * Daniel Schirmer
 *
 * 18.12.2020
 * Project : Tag_18
 * ©2020
 *
 */

package accesmodi;

public class PaketKlasse {
	public int zahl1 = 1;
	private int zahl2 = 2;
	int zahl3 = 3;
	protected int zahl4 = 4;
	
	
	public PaketKlasse() {
		this(3,3,3,3);
	}


	private PaketKlasse(int zahl1, int zahl2, int zahl3, int zahl4) {
		super();
		this.zahl1 = zahl1;
		this.zahl2 = zahl2;
		this.zahl3 = zahl3;
		this.zahl4 = zahl4;
	}


	@Override
	public String toString() {
		return "PaketKlasse [zahl1=" + zahl1 + ", zahl2=" + zahl2 + ", zahl3=" + zahl3 + ", zahl4=" + zahl4 + "]";
	}
	
	
}
