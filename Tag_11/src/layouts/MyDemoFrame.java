/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package layouts;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyDemoFrame extends JFrame{
	public MyDemoFrame(String title) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		JComboBox<String> auswahl = new JComboBox<String>();
		auswahl.addItem("Erste Wahl");
		auswahl.addItem("Zweite Wahl");
		
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Button");
		JButton button3 = new JButton("Button");
		JButton button4 = new JButton("Button");
		
		this.add(auswahl);
		this.add(button);
		this.add(button2);
		this.add(button3);
		this.add(button4);
	}
}
