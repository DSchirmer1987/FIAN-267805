/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11_Calculator
 * ©2020
 *
 */

package calculator.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import calculator.data.Calculator;

public class CalculatorButton extends JButton {
	public CalculatorButton(String text, CalculatorLabel label, Calculator calc) {
		this.setText(text);
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				label.setText(label.getText() + b.getText());
				if(b.getText() == "=") {
					checkCalculation(label.getText());
				}
			}
			public void checkCalculation(String text) {
				if(text.contains("+")) {
					calc.setZahl1(Double.valueOf(label.getText().substring(0, label.getText().indexOf('+'))));
					calc.setZahl2(Double.valueOf(label.getText().substring(label.getText().indexOf('+') +1, label.getText().indexOf('='))));
					label.setText(label.getText() + calc.addieren());
				} else if(text.contains("-")) {
					calc.setZahl1(Double.valueOf(label.getText().substring(0, label.getText().indexOf('-'))));
					calc.setZahl2(Double.valueOf(label.getText().substring(label.getText().indexOf('-') +1, label.getText().indexOf('='))));
					label.setText(label.getText() + calc.subtrahieren());
				} else if(text.contains("*")) {
					calc.setZahl1(Double.valueOf(label.getText().substring(0, label.getText().indexOf('*'))));
					calc.setZahl2(Double.valueOf(label.getText().substring(label.getText().indexOf('*') +1, label.getText().indexOf('='))));
					label.setText(label.getText() + calc.multiplizieren());
				} else {
					calc.setZahl1(Double.valueOf(label.getText().substring(0, label.getText().indexOf('/'))));
					calc.setZahl2(Double.valueOf(label.getText().substring(label.getText().indexOf('/') +1, label.getText().indexOf('='))));
					label.setText(label.getText() + calc.dividieren());
				}
			}
		});
	}
}
