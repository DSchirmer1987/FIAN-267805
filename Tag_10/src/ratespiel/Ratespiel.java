/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package ratespiel;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ratespiel {

	public static void main(String[] args) {
		Random rand = new Random();
		int zufallsZahl = rand.nextInt(10) + 1;
		System.out.println(zufallsZahl);
		
		String eingabe = JOptionPane.showInputDialog("Bitte Eine Zahl eingeben");
		int eingabeZahl = Integer.valueOf(eingabe);
		
		if(eingabeZahl == zufallsZahl) {
			JOptionPane.showMessageDialog(null, "Zahl wurde richtig geraten");
		} else {
			JOptionPane.showMessageDialog(null, "Zahl wurde falsch geraten");
		}
	}

}
