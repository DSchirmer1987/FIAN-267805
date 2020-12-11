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

public class Strichmann extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Kopf
		g.drawOval(250, 250, 50, 50);
		// Körper
		g.drawLine(275, 300, 275, 400);
		//Arme
		g.drawLine(275, 350, 250, 325);
		g.drawLine(275, 350, 300, 325);
		//Beine
		g.drawLine(275, 400, 250, 425);
		g.drawLine(275, 400, 300, 425);
	}
	
}
