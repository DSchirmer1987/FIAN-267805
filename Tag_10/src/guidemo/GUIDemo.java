/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package guidemo;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIDemo {

	public static void main(String[] args) {
		// AWT - Abstract Window Toolkit
		/*
		Frame frame = new Frame("Das Fenster mit AWT");
		frame.setSize(300, 200);
		frame.setVisible(true);
		*/
		
		// Swing
		JFrame jframe = new JFrame("Das Fenster mit Swing");
		
		
		JButton button = new JButton("Ein Button");
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Gedrückt");	
//			}
//		});
		
		button.addActionListener(e -> System.out.println("Gedrückt"));
		
		jframe.add(button);
		jframe.setSize(300, 200);
		jframe.setVisible(true);
	}
}
