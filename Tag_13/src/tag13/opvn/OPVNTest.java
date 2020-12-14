/**
 * Daniel Schirmer
 *
 * 24.07.2018
 * Project : LokalCopy
 * ©2018
 *
 */

package tag13.opvn;

public class OPVNTest {

	public static void main(String[] args) {
		Bus bus1 = new Bus(100, "Herbert", "Dorfplatz", "Marktplatz", 55);
		SBahn bahn1 = new SBahn(200, "Hubert", "Seesteg", "Hauptbahnhof", "Frieda", 8, 65);
		SBahn bahn2 = new SBahn(100, "Hubert", "Seesteg", "Hauptbahnhof", "Frieda", 8, 65);
		
		System.out.println("Bus1 = " + bus1);
		System.out.println("Bahn1 = " + bahn1);
		System.out.println("Bahn2 = " + bahn2);
		System.out.println("bus1.equals(bahn1): " + bus1.equals(bahn1));
		System.out.println("bus1.equals(bahn2): " + bus1.equals(bahn2));
	}

}
