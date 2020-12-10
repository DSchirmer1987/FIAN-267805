/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11_Calculator
 * ©2020
 *
 */

package calculator;

import calculator.data.Calculator;
import calculator.gui.CalculatorFrame;

public class Application {

	public static void main(String[] args) {
		CalculatorFrame frame = new CalculatorFrame(new Calculator());
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
