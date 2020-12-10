/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11_Calculator
 * ©2020
 *
 */

package calculator.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import calculator.data.Calculator;

public class CalculatorFrame extends JFrame{
	
	private CalculatorLabel calcLabel;
	
	public CalculatorFrame(Calculator calc) {
		this.setTitle("My Calculator");
		this.setLayout(new GridLayout(0,1));
		this.calcLabel = new CalculatorLabel();
		this.add(this.calcLabel);
		this.add(new CalculatorPanel(this.calcLabel, calc));
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		Action exitAction = new AbstractAction() {
			{
				putValue(Action.NAME, "New");
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				CalculatorFrame.this.calcLabel.setText("");
			}
		};
		fileMenu.add(exitAction);
		this.setJMenuBar(menuBar);
	}

	public CalculatorLabel getCalcLabel() {
		return calcLabel;
	}

	public void setCalcLabel(CalculatorLabel calcLabel) {
		this.calcLabel = calcLabel;
	}
}
