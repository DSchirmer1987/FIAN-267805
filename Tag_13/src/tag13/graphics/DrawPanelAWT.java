/**
 * Daniel Schirmer
 *
 * 11.12.2020
 * Project : Tag_13
 * ©2020
 *
 */

package tag13.graphics;

import java.awt.Graphics;
import java.awt.Panel;

public class DrawPanelAWT extends Panel {
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawLine(10, 10, 100, 100);
	}
}
