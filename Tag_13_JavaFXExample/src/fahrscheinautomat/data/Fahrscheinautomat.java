/**
 * Daniel Schirmer
 *
 * 20.07.2018
 * Project : Fahrscheinautomat
 * ©2018
 *
 */

package fahrscheinautomat.data;

import java.util.ArrayList;

public class Fahrscheinautomat {
	private final Integer[] muenzenEinzeln = new Integer[]{200, 100, 50, 20, 10, 5, 2, 1};
	private ArrayList<Fahrschein> fahrscheine;
	private Integer[] muenzen;
	private int geldEinwurfCent, wechselGeldCent, restGeldCent;
	private boolean bezahlt;
	private String geldEinwurfEuro, wechselGeldEuro, restGeldEuro;
	
	public Fahrscheinautomat() {
		super();
		this.setFahrscheine(new ArrayList<>());
		this.setMuenzen(new Integer[]{0, 0, 0, 0, 0, 0, 0, 0});
		this.setGeldEinwurfCent(0);
		this.setGeldEinwurfEuro(Integer.toString(this.getGeldEinwurfCent()) + "€");
	}

	public ArrayList<Fahrschein> getFahrscheine() {
		return fahrscheine;
	}

	public void setFahrscheine(ArrayList<Fahrschein> fahrscheine) {
		this.fahrscheine = fahrscheine;
	}

	public Integer[] getMuenzen() {
		return muenzen;
	}

	public void setMuenzen(Integer[] muenzen) {
		this.muenzen = muenzen;
	}

	public int getGeldEinwurfCent() {
		return geldEinwurfCent;
	}

	public void setGeldEinwurfCent(int geldEinwurfCent) {
		this.geldEinwurfCent = geldEinwurfCent;
	}
	
	public int getWechselGeldCent() {
		return wechselGeldCent;
	}

	public void setWechselGeldCent(int wechselGeldCent) {
		this.wechselGeldCent = wechselGeldCent;
	}

	public int getRestGeldCent() {
		return restGeldCent;
	}

	public void setRestGeldCent(int restGeldCent) {
		this.restGeldCent = restGeldCent;
	}

	public boolean isBezahlt() {
		return bezahlt;
	}

	public void setBezahlt(boolean bezahlt) {
		this.bezahlt = bezahlt;
	}
	
	public String getWechselGeldEuro() {
		return this.wechselGeldEuro;
	}
		
	public void setWechselGeldEuro(String wechselGeldEuro) {
		this.wechselGeldEuro = wechselGeldEuro;
	}

	public String getGeldEinwurfEuro() {
		return this.geldEinwurfEuro;
	}
	
	public void setGeldEinwurfEuro(String geldEinwurfEuro) {
		this.geldEinwurfEuro = geldEinwurfEuro;
	}

	public String getRestGeldEuro() {
		return this.restGeldEuro;
	}

	public void setRestGeldEuro(String restGeldEuro) {
		this.restGeldEuro = restGeldEuro;
	}

	@Override
	public String toString() {
		return "Fahrscheinautomat [fahrscheine=" + fahrscheine + ", geldEinwurfCent=" + geldEinwurfCent + "]";
	}
	
	public void addFahrschein(Fahrschein fahrschein) {
		this.getFahrscheine().add(fahrschein);
	}
	
	public void addFahrschein(char preisstufe, int preisCent) {
		this.getFahrscheine().add(new Fahrschein(preisstufe, preisCent));
	}
	
	public Fahrschein sucheFahrschein(char preisstufe) {
		for (Fahrschein fahrschein : fahrscheine) {
			if(fahrschein.getPreisstufe() == preisstufe) {
				return fahrschein;
			}
		}
		return null;
	}
	
	public Fahrschein sucheFahrschein(int preiscent) {
		for (Fahrschein fahrschein : fahrscheine) {
			if(fahrschein.getPreisCent() == preiscent) {
				return fahrschein;
			}
		}
		return null;
	}
	
	public void bezahlen(int fahrscheinpreis, int cent) {
		this.setGeldEinwurfCent(this.getGeldEinwurfCent() + cent);
		this.setRestGeldCent(fahrscheinpreis - this.getGeldEinwurfCent());
		this.setRestGeldEuro(this.getRestGeldCent() / 100 + "," + this.getRestGeldCent() %100 + "€");
		this.setGeldEinwurfEuro(this.getGeldEinwurfCent() / 100 + "," + this.getGeldEinwurfCent() %100 + "€");
		if(this.getGeldEinwurfCent() >= sucheFahrschein(fahrscheinpreis).getPreisCent()) {
			this.setRestGeldCent(0);
			this.setRestGeldEuro(this.getRestGeldCent() / 100 + "," + this.getRestGeldCent() %100 + "€");
			this.setWechselGeldCent(this.getGeldEinwurfCent() - sucheFahrschein(fahrscheinpreis).getPreisCent());
			this.setWechselGeldEuro(this.getWechselGeldCent() / 100 + "," + this.getWechselGeldCent() % 100 + "€");
			this.setBezahlt(true);
			this.getWechselgeldEinzeln();
		} else {
			this.setWechselGeldCent(0);
		}
	}
	
	public void reset() {
		this.setBezahlt(false);
		this.setGeldEinwurfCent(0);
		this.setWechselGeldCent(0);
		this.setMuenzen(new Integer[]{0, 0, 0, 0, 0, 0, 0, 0});
	}
			
	public void getWechselgeldEinzeln() {
		int tmp = this.getWechselGeldCent();
		for(int i = 0; i < this.muenzenEinzeln.length; i++) {
			while (tmp / this.muenzenEinzeln[i] >= 1) {
				tmp = tmp - this.muenzenEinzeln[i];
				if(this.getMuenzen()[i] == null) {
					this.getMuenzen()[i] = 1;
				} else {
					this.getMuenzen()[i] += 1;
				}				
			}
		}
	}
	
}
