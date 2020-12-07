/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_09
 * ©2020
 *
 */

package littlewitch;

public enum Clock {
	Sechs(6, "Morgens früh um 6 \nkommt die kleine Hex."), 
	Sieben(7, "Morgens früh um 7 \nschabt sie gelbe Rüben."), 
	Acht(8, "Morgens früh um 8 \nwird Kaffee gemacht."), 
	Neun(9, "Morgens früh um 9 \ngeht sie in die Scheun'."), 
	Zehn(10, "Morgens früh um 10 \nhackt sie Holz und Spän'."), 
	Elf(11, "Feuert an um 11,"), 
	Zwoelf(12, "kocht dann bis um 12: \nFröschebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch!");
	
	private final int uhrzeit;
	private final String ausgabe;
	
	Clock(int Uhrzeit, String ausgabe){
		this.uhrzeit = Uhrzeit;
		this.ausgabe = ausgabe;
	}

	public int getUhrzeit() {
		return uhrzeit;
	}

	public String getAusgabe() {
		return ausgabe;
	}
}
