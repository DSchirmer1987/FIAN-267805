/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package layouts;

import java.awt.GridLayout;

public class GridLayoutDemo {

	public static void main(String[] args) {
		MyDemoFrame frame = new MyDemoFrame("GridLayout");
		
		frame.setLayout(new GridLayout(0, 2));
		frame.pack();
		frame.setVisible(true);
	}

}
