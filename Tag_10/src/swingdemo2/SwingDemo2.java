/**
 * Daniel Schirmer
 *
 * 08.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package swingdemo2;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingDemo2 {
	public static void main(String[] args) {
		// Schnellaufgabe: Ein Fenster mit Label und Button. Labeltext soll mit Buttondruck geändert werden.
		
		JFrame myframe = new JFrame("Ein Fenster");
		myframe.setSize(640, 480);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Ein Label");
		JButton button = new JButton("Ein Button");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText("Label geändert");
			}	
		});
		
		JPanel panel = new JPanel(new GridLayout(1,2));
		panel.add(label);
		panel.add(button);
		myframe.add(panel);
		
		myframe.setVisible(true);
	}
}
