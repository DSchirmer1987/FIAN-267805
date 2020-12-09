/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package menu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class MenuBarDemo {

	public static void main(String[] args) {
		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(5,5));
		
		frame.add(new JButton("Page Start"), BorderLayout.NORTH);
		frame.add(new JButton("Line End"), BorderLayout.EAST);
		frame.add(new JButton("Page End"), BorderLayout.SOUTH);
		frame.add(new JButton("Line Start"), BorderLayout.WEST);
		frame.add(new JButton("Center"));
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.add(new JMenuItem("Close"));
		
		Action exitAction = new AbstractAction() {
			{
				putValue(Action.NAME, "Exit");
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		
		fileMenu.add(exitAction);
		
		frame.setJMenuBar(menuBar);
		
		frame.setSize(400, 150);
		frame.setVisible(true);
	}

}
