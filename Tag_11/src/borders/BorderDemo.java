/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package borders;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class BorderDemo {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.setLayout(new GridLayout(0, 2, 10, 10));
		
		JButton jbutton1 = new JButton("Raised BevelBorder");
		JButton jbutton2 = new JButton("Lowered BevelBorder");
		JButton jbutton3 = new JButton("Etched Border");
		JButton jbutton4 = new JButton("Line Border");
		
		jbutton1.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbutton2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		jbutton3.setBorder(new EtchedBorder(Color.BLUE, Color.YELLOW));
		jbutton4.setBorder(new LineBorder(Color.RED));
		
		jframe.add(jbutton1);
		jframe.add(jbutton2);
		jframe.add(jbutton3);
		jframe.add(jbutton4);
		
		jframe.setSize(500, 200);
		jframe.setVisible(true);
	}

}
