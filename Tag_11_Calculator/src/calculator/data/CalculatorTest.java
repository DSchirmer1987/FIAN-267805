/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_11_Calculator
 * ©2021
 *
 */

package calculator.data;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	public static Calculator calc;
	
	@BeforeClass
	public static void create() {
		calc = new Calculator(5, 6);
	}

	@Test
	public void testAddieren() {
		assertTrue(11 == calc.addieren());
	}

}
