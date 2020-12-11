/**
 * Daniel Schirmer
 *
 * 20.07.2018
 * Project : Fahrscheinautomat
 * ©2018
 *
 */

package fahrscheinautomat.data;

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
