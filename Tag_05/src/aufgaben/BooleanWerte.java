/**
 * Daniel Schirmer
 *
 * 01.12.2020
 * Project : Tag_05
 * ©2020
 *
 */

package aufgaben;

public class BooleanWerte {
	public boolean[] trueAndFalse;

	public boolean[] getTrueAndFalse() {
		return trueAndFalse;
	}

	public void setTrueAndFalse(boolean[] trueAndFalse) {
		this.trueAndFalse = trueAndFalse;
	}
	
	public BooleanWerte() {
		this.trueAndFalse = new boolean[]{true, false};
	}
	
	public void booleanAusgeben() {
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				boolean result = trueAndFalse[i] && trueAndFalse[j];
				System.out.println(trueAndFalse[i] + " && " + trueAndFalse[j] + " liefert " + result);				
				result = trueAndFalse[i] || trueAndFalse[j];
				System.out.println(trueAndFalse[i] + " || " + trueAndFalse[j] + " liefert " + result);				
				result = trueAndFalse[i] ^ trueAndFalse[j];
				System.out.println(trueAndFalse[i] + " ^ " + trueAndFalse[j] + " liefert " + result);				
				System.out.print("\n");
			}
		}
	}
}
