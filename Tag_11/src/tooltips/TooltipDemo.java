/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package tooltips;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TooltipDemo {
	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jbutton = new JButton("Ein Button");
		jbutton.setToolTipText("Ich bin ein Button");
		
		jframe.add(jbutton);
		jframe.setSize(200, 200);
		jframe.setVisible(true);
	}
}
