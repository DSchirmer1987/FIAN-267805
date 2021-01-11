/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package guirepeat;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiRepeat {

	public static void main(String[] args) {
		String text = "Hallo Welt";
		for (String string : args) {
			text = string;
		}
		if(args.length > 0) {
			if(args[0].equals("Debug")) {
				text = "Debug Mode";
			} else if (args[0].equals("Config")) {
				text = "Config Mode";
			}
		} else {
			text = "Default Mode";
		}
			
		JFrame frame = new JFrame();
		frame.setTitle("Mein Fenster");
		frame.setSize(680, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel();
		label.setText(text);
		frame.add(label);
		
		frame.setVisible(true);
	}

}
