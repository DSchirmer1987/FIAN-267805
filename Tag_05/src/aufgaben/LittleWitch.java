/**
 * Daniel Schirmer
 *
 * 02.12.2020
 * Project : Tag_05
 * �2020
 *
 */

package aufgaben;

public class LittleWitch {

	public static void main(String[] args) {
		int clock = 6;
		String morgens = "Morgens fr�h um ";
		for (; clock < 13; clock++) {
			switch (clock) {
				case 6: {
					System.out.println(morgens + clock);
					System.out.println("kommt die kleine Hex.");
					break;
				}
				case 7: {
					System.out.println(morgens + clock);
					System.out.println("schabt sie gelbe R�ben.");
					break;
				}
				case 8: {
					System.out.println(morgens + clock);
					System.out.println("wird Kaffee gemacht.");
					break;
				}
				case 9: {
					System.out.println(morgens + clock);
					System.out.println("geht sie in die Scheun'.");
					break;
				}
				case 10: {
					System.out.println(morgens + clock);
					System.out.println("hackt sie Holz und Sp�n'.");
					break;
				}
				case 11: {
					System.out.println("Feuert an um" + clock + ",");
					break;
				}
				case 12: {
					System.out.println("kocht dann bis um " + clock + ":");
					System.out.println("Fr�schebein und Krebs und Fisch.");
					System.out.println("Hurtig Kinder kommt zu Tisch!");
				}
			}
		}
	}

}
