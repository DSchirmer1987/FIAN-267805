/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * ©2020
 *
 */

package threadTiere;

public class Test {

	public static void main(String[] args) {
		Katze tom = new Katze("Tom", 3, true);
		Hund rex = new Hund("Rex", 4, true);
		
		Thread katze = new Thread(new Runnable() {		
			@Override
			public void run() {
				tom.laufen();
			}
		});
		Thread hund = new Thread(new Runnable() {		
			@Override
			public void run() {
				rex.laufen();
			}
		});
		
		katze.run();
		hund.run();
	}
	

}
