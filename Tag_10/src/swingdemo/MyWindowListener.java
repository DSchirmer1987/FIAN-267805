/**
 * Daniel Schirmer
 *
 * 08.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package swingdemo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class MyWindowListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

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

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
