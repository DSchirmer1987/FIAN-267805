/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package littlewitch;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LittleWitch {
	public static int clock = 6;
	public static int hexeTmp = 6;
	public static int tmp = 1;
	public static int counter = 1;
	
	public static void main(String[] args) {
		JFrame fenster = new JFrame("Kleine Hexe");
		fenster.setSize(640, 480);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setLayout(new GridLayout(2, 2));
		
		JLabel label = new JLabel();
		label.setText("Die Kleine Hexe");
		
		JButton button = new JButton("Schreibe Gedichtzeile");
		
		ArrayList<String> littlewitch = new ArrayList<String>();
		littlewitch.add("Morgens früh um ");
		littlewitch.add("kommt die kleine Hex.");
		littlewitch.add("schabt sie gelbe Rüben.");
		littlewitch.add("wird Kaffee gemacht.");
		littlewitch.add("geht sie in die Scheun'.");
		littlewitch.add("hackt sie Holz und Spän'.");
		littlewitch.add("Feuert an um 11,");
		littlewitch.add("kocht dann bis um 12:");
		littlewitch.add("Fröschebein und Krebs und Fisch.");
		littlewitch.add("hurtig Kinder kommt zu Tisch!");
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(tmp % 2 == 0 && counter < 6) {
					label.setText(littlewitch.get(counter));
					counter++;
					tmp++;
				} else if(clock >= 6 && clock <= 10) {
					label.setText(littlewitch.get(0) + clock);
					clock++;
					tmp++;
				} else if(hexeTmp >=6 &&  hexeTmp <= 9) {
					label.setText(littlewitch.get(hexeTmp));
					hexeTmp++;
				}
			}
		});
		
		
		fenster.add(label);
		fenster.add(button);
		fenster.setVisible(true);
	}
}
