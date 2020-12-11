/**
 * Daniel Schirmer
 *
 * 11.12.2020
 * Project : Tag_13
 * ©2020
 *
 */

package tag13.graphics;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GraphicsDemo {

	public static void main(String[] args) {
//		new DrawingFrame().setVisible(true);
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(650,650);
		f.setLayout(new GridLayout(0, 2));
		f.add(new Strichmann());
		f.add(new Strichmann());
		f.setVisible(true);
		System.out.println(f.getInsets());
	}

}
