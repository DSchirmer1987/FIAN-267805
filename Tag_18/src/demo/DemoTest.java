/**
 * Daniel Schirmer
 *
 * 18.12.2020
 * Project : Tag_18
 * ©2020
 *
 */

package demo;

import accesmodi.PaketKlasse;
import calculator.data.Calculator;

public class DemoTest {

	public static void main(String[] args) {
		// Startwert: -Xms128m 
		// Maximal: -Xmx128m
		Calculator calculator = new Calculator();
		calculator.setZahl1(5);
		
		System.out.println(calculator.getZahl1());

	}

}
