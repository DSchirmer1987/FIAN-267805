/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11
 * ©2020
 *
 */

package layouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutDemo {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new  JPanel();
		
		GridBagLayout gbl = new GridBagLayout();
		p.setLayout(gbl);
		
		addComponent(p, gbl, new JButton("1"), 0, 0, 2, 2, 1.0, 1.0);
		addComponent(p, gbl, new JButton("2"), 2, 0, 1, 1, 1.0, 1.0);
		addComponent(p, gbl, new JButton("3"), 2, 1, 1, 1, 1.0, 1.0);
		addComponent(p, gbl, new JButton("4"), 0, 2, 3, 1, 1.0, 1.0);
		addComponent(p, gbl, new JButton("5"), 0, 3, 2, 1, 1.0, 1.0);
		addComponent(p, gbl, new JButton("6"), 0, 4, 2, 1, 1.0, 1.0);
		addComponent(p, gbl, new JButton("7"), 2, 3, 1, 2, 1.0, 1.0);
		addComponent(p, gbl, new JButton("8"), 3, 0, 1, 7, 1.0, 1.0);
		
		f.add(p);
		f.setSize(300, 200);
		f.setVisible(true);	
	}
	
	public static void addComponent(Container cont, GridBagLayout gbl, Component comp, int x, int y, int width, int height, double weightx, double weighty) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		gbl.setConstraints(comp, gbc);
		cont.add(comp);
	}
}
