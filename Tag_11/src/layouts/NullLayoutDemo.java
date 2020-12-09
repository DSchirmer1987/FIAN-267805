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
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NullLayoutDemo {

	public static void main(String[] args) {
		JFrame f = new JFrame("Null Layout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		
		p.setLayout(null);
		JButton b = new JButton("B 1");
		JButton b2 = new JButton("B 2");
		b2.setBounds(0, 0, 100, 50);
		b.setBounds(200, 0, 100, 50);
		p.add(b);
		p.add(b2);
		
		f.add(p);
		f.setSize(500, 500);
		f.setVisible(true);
	}

}
