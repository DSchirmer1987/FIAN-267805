/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package myexception;

public class KontoTest {

	public static void main(String[] args) {
		Konto k1 = new Konto();
		Konto k2 = new Konto(3000.0);
		
		System.out.println(k1);
		System.out.println(k2);
		
		try {
			k1.geldAbheben(500);
		} catch (NegativeSaldoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
