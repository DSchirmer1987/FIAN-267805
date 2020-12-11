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

import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 0, 50, 25);
		g.fillRect(50, 50, 50, 25);
		g.drawRoundRect(50, 100, 50, 25, 25, 25);
		g.fillRoundRect(50, 150, 50, 25, 25, 25);
		g.draw3DRect(50, 200, 50, 25, false);
		g.fill3DRect(50, 250, 50, 25, true);
		
		g.drawOval(150, 0, 50, 25);
		g.fillOval(150, 50, 50, 25);
		g.drawArc(150, 100, 50, 25, 0, 270);
		g.fillArc(150, 150, 50, 25, 0, 270);
	}
	
	

}
