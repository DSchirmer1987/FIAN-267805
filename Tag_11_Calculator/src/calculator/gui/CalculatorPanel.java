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

import javax.swing.JPanel;

import calculator.data.Calculator;

public class CalculatorPanel extends JPanel {
	public CalculatorPanel(CalculatorLabel label, Calculator calc) {
		this.setLayout(new GridLayout(0,4,5,5 ));
		for(int i=7; i<10; i++) {
			this.add(new CalculatorButton(String.valueOf(i), label, calc));
		}
		this.add(new CalculatorButton("/", label, calc));
		for(int i=4; i<7; i++) {
			this.add(new CalculatorButton(String.valueOf(i), label, calc));
		}
		this.add(new CalculatorButton("*", label, calc));
		for(int i=1; i<4; i++) {
			this.add(new CalculatorButton(String.valueOf(i), label, calc));
		}
		this.add(new CalculatorButton("-", label, calc));
		this.add(new CalculatorButton("0", label, calc));
		this.add(new CalculatorButton(".", label, calc));
		this.add(new CalculatorButton("=", label, calc));
		this.add(new CalculatorButton("+", label, calc));
	}
}
