/**
 * Daniel Schirmer
 *
 * 08.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package swingtest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class MyButton extends JButton {
	public MyButton(String title, String name) {
		this.setText(title);
		this.setName(name);
		this.addMouseListener(new MouseAdapter() {
			@Override public void mouseClicked(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				System.out.println(b.getText());
				b.setText("Gedrückt");
			}
		});
	}
}
