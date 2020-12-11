/**
 * Daniel Schirmer
 *
 * 10.12.2020
 * Project : Tag_12_FahrscheinAutomat
 * ©2020
 *
 */

package fahrscheinautomat.controller;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import fahrscheinautomat.model.Fahrschein;
import fahrscheinautomat.model.Fahrscheinautomat;
import fahrscheinautomat.view.MyButton;
import fahrscheinautomat.view.MyFrame;
import fahrscheinautomat.view.MyLabel;
import fahrscheinautomat.view.MyPanel;

public class GUIController implements ActionListener{
	
	Fahrscheinautomat fahrscheinautomat;
	public GUIController() {
		this.fahrscheinautomat = new Fahrscheinautomat();
		this.fahrscheinautomat.addFahrschein(new Fahrschein('K', 140));
		this.fahrscheinautomat.addFahrschein(new Fahrschein('A', 230));
		this.fahrscheinautomat.addFahrschein(new Fahrschein('B', 470));
		this.fahrscheinautomat.addFahrschein(new Fahrschein('C', 960));
		this.fahrscheinautomat.addFahrschein(new Fahrschein('D', 1140));
		
		MyFrame frame = new MyFrame("Fahrscheinautomat");
		frame.setLayout(new BorderLayout(5,5));
		
		MyLabel label = new MyLabel();
		
		MyPanel fahrscheinPanel = new MyPanel();
		fahrscheinPanel.setLayout(new GridLayout(0,1,5,5));
		fahrscheinPanel.add(new JLabel("Fahrschein wählen"));
		fahrscheinPanel.add(new MyButton("K", "140"));
		fahrscheinPanel.add(new MyButton("A", "230"));
		fahrscheinPanel.add(new MyButton("B", "470"));
		fahrscheinPanel.add(new MyButton("C", "960"));
		fahrscheinPanel.add(new MyButton("D", "1140"));
		
		MyPanel muenzPanel = new MyPanel();
		muenzPanel.setLayout(new GridLayout(0,1,5,5));
		muenzPanel.add(new JLabel("Geldeinwurf"));
		muenzPanel.add(new MyButton("20€", "2000"));
		muenzPanel.add(new MyButton("10€", "1000"));
		muenzPanel.add(new MyButton("5€", "500"));
		muenzPanel.add(new MyButton("2€", "200"));
		muenzPanel.add(new MyButton("1€", "100"));
		muenzPanel.add(new MyButton("50 Cent", "50"));
		muenzPanel.add(new MyButton("20 Cent", "20"));
		muenzPanel.add(new MyButton("10 Cent", "10"));
		muenzPanel.add(new MyButton("5 Cent", "5"));
		muenzPanel.add(new MyButton("2 Cent", "2"));
		muenzPanel.add(new MyButton("1 Cent", "1"));
		
		frame.add(label);
		frame.add(fahrscheinPanel,BorderLayout.WEST);
		frame.add(muenzPanel, BorderLayout.EAST);
		frame.add(new JLabel(" "), BorderLayout.SOUTH);
		frame.setSize(500, 500);
		
		this.getElements(frame);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action performed");
	}
	
	private void getElements(Component rootComp) {
		
		Container component = (Container) rootComp;
		
		for(Component innerComp : component.getComponents()) {
			getElements(innerComp);
			
			if(innerComp instanceof JButton) {
				((JButton) innerComp).addActionListener(this);
			}
		}
	}
}
