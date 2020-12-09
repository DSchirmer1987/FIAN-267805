/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(5,5));
		
		frame.add(new JButton("Page Start"), BorderLayout.NORTH);
		frame.add(new JButton("Line End"), BorderLayout.EAST);
		frame.add(new JButton("Page End"), BorderLayout.SOUTH);
		frame.add(new JButton("Line Start"), BorderLayout.WEST);
		frame.add(new JButton("Center"));
		
		frame.setSize(400, 150);
		frame.setVisible(true);
	}

}
