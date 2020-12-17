/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package myexception;

import static org.junit.Assert.*;

import org.junit.Test;

public class KontoTest2 {
	public Konto konto = new Konto(50);

	@Test
	public void testGetSaldo() {
		assertTrue(50 == konto.getSaldo());
	}

}
