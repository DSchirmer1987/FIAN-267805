/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class FlowLayoutDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JComboBox<String> auswahl = new JComboBox<String>();
		auswahl.addItem("Erste Wahl");
		auswahl.addItem("Zweite Wahl");
		
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Button");
		JButton button3 = new JButton("Button");
		JButton button4 = new JButton("Button");
		
		frame.add(auswahl);
		frame.add(button);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.setSize(200, 500);
		frame.setVisible(true);
	}
}
