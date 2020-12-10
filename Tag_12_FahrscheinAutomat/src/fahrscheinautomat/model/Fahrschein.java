/**
 * Daniel Schirmer
 *
 * 10.12.2020
 * Project : Tag_12_FahrscheinAutomat
 * ©2020
 *
 */

package fahrscheinautomat.model;

public class Fahrschein {
	private char preisstufe;
	private int preisCent;

	public Fahrschein(char preisstufe, int preisCent) {
		super();
		this.setPreisstufe(preisstufe);
		this.setPreisCent(preisCent);
	}

	public char getPreisstufe() {
		return preisstufe;
	}

	public void setPreisstufe(char preisstufe) {
		this.preisstufe = preisstufe;
	}

	public int getPreisCent() {
		return preisCent;
	}

	public void setPreisCent(int preisCent) {
		this.preisCent = preisCent;
	}

	@Override
	public String toString() {
		return "Fahrschein [preisstufe=" + preisstufe + ", preisCent=" + preisCent + "]";
	}
	
	public String getPreisEuro() {
		return this.getPreisCent() / 100 + "," + this.getPreisCent() % 100 + "€";
	}
}
