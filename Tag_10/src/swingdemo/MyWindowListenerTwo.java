/**
 * Daniel Schirmer
 *
 * 08.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package swingdemo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class MyWindowListenerTwo extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		int option = JOptionPane.showConfirmDialog(null, "Anwendung schlieﬂen?");
		if(option == JOptionPane.OK_OPTION) {
			System.out.println("Fenster wird geschlossen");
			e.getWindow().dispose();
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Fenster geschlossen!");
		System.exit(0);
	}
	
}
