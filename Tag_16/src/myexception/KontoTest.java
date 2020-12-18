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
		int counter = 0;
		
		k1.setSaldo(650000);
		k1.saldo = 650000;
		System.out.println(k1);
		System.out.println(k2);
		k1 = null;
		System.gc();
		
		for (int i = 0; i < 10000; i++) {
			counter++;
		}
		
//		try {
//			k1.geldAbheben(500);
//		} catch (NegativeSaldoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	public static void abholen(Konto k1) throws NegativeSaldoException {
		k1.geldAbheben(50000);
	}

}
