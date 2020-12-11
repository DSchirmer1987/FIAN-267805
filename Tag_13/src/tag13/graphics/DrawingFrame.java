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
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawingFrame extends Frame {
	public DrawingFrame() {
		this.setSize(350, 350);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}		
		});
	}

	@Override
	public void paint(Graphics g) {
		g.drawString("Hallo Jave Welt", this.getInsets().left, this.getSize().height - this.getInsets().bottom);
		System.out.println(this.getInsets());
	}
}
