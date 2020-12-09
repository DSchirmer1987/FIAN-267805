/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package layouts;


import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class BoxLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JPanel jpanel = new JPanel();
//		jpanel.setLayout(new javax.swing.BoxLayout(jpanel, javax.swing.BoxLayout.X_AXIS));
		Box jpanel = new Box(javax.swing.BoxLayout.X_AXIS);
		
		JComboBox<String> auswahl = new JComboBox<String>();
		auswahl.addItem("Erste Wahl");
		auswahl.addItem("Zweite Wahl");
		
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Button");
		JButton button3 = new JButton("Button");
		JButton button4 = new JButton("Button");
		
		jpanel.add(auswahl);
		jpanel.add(button);
		jpanel.add(button2);
		jpanel.add(button3);
		jpanel.add(button4);
		frame.add(jpanel);
		frame.setSize(200, 500);
		frame.setVisible(true);
	}

}
