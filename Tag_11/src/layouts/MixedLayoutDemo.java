/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * �2020
 *
 */

package layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixedLayoutDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 2));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(new JButton("Page Start"), BorderLayout.NORTH);
		panel.add(new JButton("Line End"), BorderLayout.EAST);
		panel.add(new JButton("Page End"), BorderLayout.SOUTH);
		panel.add(new JButton("Line Start"), BorderLayout.WEST);
		panel.add(new JButton("Center"));
		
		JButton jbutton = new JButton("Button");
		JComboBox<String> auswahl = new JComboBox<String>();
		auswahl.addItem("Erste Wahl");
		auswahl.addItem("Zweite Wahl");
		
		frame.add(panel);
		frame.add(auswahl);
		frame.add(jbutton);
		
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
