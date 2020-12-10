/**
 * Daniel Schirmer
 *
 * 10.12.2020
 * Project : Tag_12_FahrscheinAutomat
 * ©2020
 *
 */

package fahrscheinautomat.view;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class MyButton extends JButton {

	public MyButton(String title, String name) {
		this.setText(title);
		this.setName(name);
		this.setBorder(new BevelBorder(BevelBorder.RAISED));
	}
}
