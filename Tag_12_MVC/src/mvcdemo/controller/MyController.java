/**
 * Daniel Schirmer
 *
 * 10.12.2020
 * Project : Tag_12_MVC
 * ©2020
 *
 */

package mvcdemo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import mvcdemo.model.Kuh;
import mvcdemo.view.MyButton;
import mvcdemo.view.MyFrame;
import mvcdemo.view.MyLabel;

public class MyController implements ActionListener{
	private MyFrame myFrame;
	private MyLabel myLabel;
	private Kuh kuh;
	private MyButton myButton;
	private MyActionListener myActionListener;
	
	public MyController() {
		this.myFrame = new MyFrame();
		this.myLabel = new MyLabel();
		this.myButton = new MyButton();
		this.kuh = new Kuh("Berta", "Gelb");
		myFrame.add(this.myLabel);
		myFrame.add(this.myButton);
		this.myButton.addActionListener(this);
		this.myLabel.setText(kuh.toString());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		JMenuItem newItem = new JMenuItem("New");
		fileMenu.add(newItem);
		this.myFrame.setJMenuBar(menuBar);
		newItem.addActionListener(this);
		// Strg + N
		newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
		myFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.kuh.toString());	
	}
}
